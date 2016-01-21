/*
===============================================================
   _____                       ______
  / ___/____ _____ ___  ____ _/ ____/___ _____ ___  ___  _____
  \__ \/ __ `/ __ `__ \/ __ `/ / __/ __ `/ __ `__ \/ _ \/ ___/
 ___/ / /_/ / / / / / / /_/ / /_/ / /_/ / / / / / /  __(__  )
/____/\__,_/_/ /_/ /_/\__,_/\____/\__,_/_/ /_/ /_/\___/____/

===============================================================
  Persistance API
  Copyright (c) for SamaGames, all right reserved
  By MisterSatch, January 2016
===============================================================
*/

package DataManager;

import Beans.PlayerBean;
import Utils.Transcoder;
import javax.sql.DataSource;
import java.sql.*;


public class PlayerManager
{
    // Defines
    Connection connection = null;
    Statement statement = null;
    ResultSet resultset = null;
    PlayerBean player = null;

    // Get player by UUID
    public PlayerBean getPlayer(String uuid, DataSource dataSource)
    {
        // Make the research of player by UUID
        try
        {
            // Set connection
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            // Query construction
            String sql = "";
            sql += "select (HEX(uuid)), name, coins, stars, lastlogin, firstlogin from players where uuid=(UNHEX('"+Transcoder.Encode(uuid)+"'))";

            // Execute the query
            resultset = statement.executeQuery(sql);

            // Manage the result in a bean
            resultset.next();
            String playerUuid = Transcoder.Decode(resultset.getString(1));
            String name = resultset.getString(2);
            int coins = resultset.getInt(3);
            int stars = resultset.getInt(4);
            Timestamp lastLogin = resultset.getTimestamp(5);
            Timestamp firsLogin = resultset.getTimestamp(6);
            player = new PlayerBean(playerUuid, name, coins, stars, lastLogin, firsLogin);

        }
        catch(SQLException e)
        {
            e.printStackTrace(); //TODO Change the granularity of exception
        }
        finally
        {
            // Close the query environment in order to prevent leaks
            close();
        }
        return player;
    }

    // Update the player data
    public void updatePlayer(PlayerBean player, DataSource dataSource)
    {
        // Update the players data
        try
        {
            // Set connection
            connection = dataSource.getConnection();
            statement = connection.createStatement();

            // Query construction
            String sql = "";
            sql += "update players set coins=" + player.getCoins();
            sql += ", stars=" + player.getStars();
            sql += ", lastlogin='" + player.getLastLogin() +"'";
            sql += ", firstlogin='" + player.getLastLogin() +"'";
            sql += " where uuid=(UNHEX('" + Transcoder.Encode(player.getUuid()) + "'))";

            // Execute the query
            statement.executeUpdate(sql);
        }
        catch (Exception e)
        {
            e.printStackTrace(); //TODO Change the granularity of exception
        }
        finally
        {
            // Close the query environment in order to prevent leaks
            close();
        }
    }

    // Close the connection
    public void close()
    {
        // Close the query environment in order to prevent leaks
        try
        {
            if (resultset != null)
            {
                // Close the resulset
                resultset.close();
            }
            if (statement != null)
            {
                // Close the statement
                statement.close();
            }
            if (connection != null)
            {
                // Close the connection
                connection.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace(); //TODO Change the granularity of exception
        }
    }
}
