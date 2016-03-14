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

package net.samagames.persistanceapi.beans.permissions;

import com.sun.org.apache.xpath.internal.operations.Bool;
import net.samagames.persistanceapi.utils.Perm;
import net.samagames.persistanceapi.utils.Transcoder;

import java.util.Map;

public class APIPermissionsBean
{
    /* Database Structure

    Table : api_permissions
    +-------------------------+------------+------+-----+---------+----------------+
    | Field                   | Type       | Null | Key | Default | Extra          |
    +-------------------------+------------+------+-----+---------+----------------+
    | groups_id               | bigint(20) | NO   | PRI | NULL    | auto_increment |
    | api_servers_debug       | tinyint(1) | NO   |     | NULL    |                |
    | api_permissions_refresh | tinyint(1) | NO   |     | NULL    |                |
    | api_coins_getother      | tinyint(1) | NO   |     | NULL    |                |
    | api_coins_credit        | tinyint(1) | NO   |     | NULL    |                |
    | api_coins_withdraw      | tinyint(1) | NO   |     | NULL    |                |
    | api_inventory_show      | tinyint(1) | NO   |     | NULL    |                |
    | api_playerdata_show     | tinyint(1) | NO   |     | NULL    |                |
    | api_playerdata_set      | tinyint(1) | NO   |     | NULL    |                |
    | api_playerdata_del      | tinyint(1) | NO   |     | NULL    |                |
    | api_modo_speakup        | tinyint(1) | NO   |     | NULL    |                |
    | api_stars_getother      | tinyint(1) | NO   |     | NULL    |                |
    | api_stars_credit        | tinyint(1) | NO   |     | NULL    |                |
    | api_stars_withdraw      | tinyint(1) | NO   |     | NULL    |                |
    | api_game_start          | tinyint(1) | NO   |     | NULL    |                |
    +-------------------------+------------+------+-----+---------+----------------+
    */

    // Defines
    private long groupsId;

    @Perm("api.servers.debug")
    private boolean apiServersDebug;
    @Perm("api.permissions.refresh")
    private boolean apiPermissionsRefresh;
    @Perm("api.coins.other")
    private boolean apiCoinsGetOther;
    @Perm("api.coins.credit")
    private boolean apiCoinsCredit;
    @Perm("api.coins.withdraw")
    private boolean apiCoinsWithdraw;
    @Perm("api.inventory.show")
    private boolean apiInventoryShow;
    @Perm("api.playerdata.show")
    private boolean apiPlayerDataShow;
    @Perm("api.playerdata.set")
    private boolean apiPlayerdataSet;
    @Perm("api.playerdata.del")
    private boolean apiPlayerdataDel;
    @Perm("api.modo.speakup")
    private boolean apiModoSpeakup;
    @Perm("api.stars.getother")
    private boolean apiStarsGetother;
    @Perm("api.stars.credit")
    private boolean apiStarsCredit;
    @Perm("api.stars.withdraw")
    private boolean apiStarsWithdraw;
    @Perm("api.game.start")
    private boolean apiGameStart;

    // Constructor
    public APIPermissionsBean(long groupsId, boolean apiServersDebug, boolean apiPermissionsRefresh, boolean apiCoinsGetOther, boolean apiCoinsCredit, boolean apiCoinsWithdraw,
                              boolean apiInventoryShow, boolean apiPlayerDataShow, boolean apiPlayerdataSet, boolean apiPlayerdataDel, boolean apiModoSpeakup, boolean apiStarsGetother,
                              boolean apiStarsCredit, boolean apiStarsWithdraw, boolean apiGameStart)
    {
        this.apiServersDebug = apiServersDebug;
        this.apiPermissionsRefresh = apiPermissionsRefresh;
        this.apiCoinsGetOther = apiCoinsGetOther;
        this.apiCoinsCredit = apiCoinsCredit;
        this.apiCoinsWithdraw = apiCoinsWithdraw;
        this.apiInventoryShow = apiInventoryShow;
        this.apiPlayerDataShow = apiPlayerDataShow;
        this.apiPlayerdataSet = apiPlayerdataSet;
        this.apiPlayerdataDel = apiPlayerdataDel;
        this.apiModoSpeakup = apiModoSpeakup;
        this.apiStarsGetother = apiStarsGetother;
        this.apiStarsCredit = apiStarsCredit;
        this.apiStarsWithdraw = apiStarsWithdraw;
        this.apiGameStart =apiGameStart;
    }

    // Getters
    public long groupsId() { return this.groupsId; }
    public boolean isApiServersDebug() { return this.apiServersDebug; }
    public boolean isApiPermissionsRefresh() { return this.apiPermissionsRefresh; }
    public boolean isApiCoinsGetother() { return this.apiCoinsGetOther; }
    public boolean isApiCoinsCredit() { return this.apiCoinsCredit; }
    public boolean isApiCoinsWithdraw() { return this.apiCoinsWithdraw; }
    public boolean isApiInventoryShow() { return this.apiInventoryShow; }
    public boolean isApiPlayerDataShow() {return this.apiPlayerDataShow;}
    public boolean isApiPlayerdataSet() { return this.apiPlayerdataSet; }
    public boolean isApiPlayerdataDel() { return this.apiPlayerdataDel; }
    public boolean isApiModoSpeakup() { return this.apiModoSpeakup; }
    public boolean isApiStarsGetother() { return this.apiStarsGetother; }
    public boolean isApiStarsCredit() { return this.apiStarsCredit; }
    public boolean isApiStarsWithdraw() { return this.apiStarsWithdraw; }
    public boolean isApiGameStart() { return this.apiGameStart; }

    // Setters
    public void setApiServersDebug(boolean apiServersDebug) { this.apiServersDebug = apiServersDebug; }
    public void setApiPermissionsRefresh(boolean apiPermissionsRefresh) { this.apiPermissionsRefresh = apiPermissionsRefresh; }
    public void setApiCoinsGetother(boolean apiCoinsGetother) { this.apiCoinsGetOther = apiCoinsGetother; }
    public void setApiCoinsCredit(boolean apiCoinsCredit) { this.apiCoinsCredit = apiCoinsCredit; }
    public void setApiCoinsWithdraw(boolean apiCoinsWithdraw) { this.apiCoinsWithdraw = apiCoinsWithdraw; }
    public void setApiInventoryShow(boolean apiInventoryShow) { this.apiInventoryShow = apiInventoryShow; }
    public void setApiPlayerDataShow(boolean apiPlayerDataShow) { this.apiPlayerDataShow = apiPlayerDataShow; }
    public void setApiPlayerdataSet(boolean apiPlayerdataSet) { this.apiPlayerdataSet = apiPlayerdataSet; }
    public void setApiPlayerdataDel(boolean apiPlayerdataDel) { this.apiPlayerdataDel = apiPlayerdataDel; }
    public void setApiModoSpeakup(boolean apiModoSpeakup) { this.apiModoSpeakup = apiModoSpeakup; }
    public void setApiStarsGetother(boolean apiStarsGetother) { this.apiStarsGetother = apiStarsGetother; }
    public void setApiStarsCredit(boolean apiStarsCredit) { this.apiStarsCredit = apiStarsCredit; }
    public void setApiStarsWithdraw(boolean apiStarsWithdraw) { this.apiStarsWithdraw = apiStarsWithdraw; }
    public void setApiGameStart(boolean apiGameStart) { this.apiGameStart = apiGameStart; }

    // Reverse the bean to HashMap
    public Map<String, Boolean> getHashMap()
    {
        return Transcoder.getHashMapPerm(this);
    }

    public void set(String key, Boolean value)
    {
        Transcoder.setAnnotationValue(this, key, value);
    }
}
