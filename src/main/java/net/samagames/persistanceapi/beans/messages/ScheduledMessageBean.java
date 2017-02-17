package net.samagames.persistanceapi.beans.messages;

import java.beans.ConstructorProperties;

/**
 *                )\._.,--....,'``.
 * .b--.        /;   _.. \   _\  (`._ ,.
 * `=,-,-'~~~   `----(,_..'--(,_..'`-.;.'
 *
 * Created by Jérémy L. (BlueSlime) on 17/02/2017
 */
public class ScheduledMessageBean
{
    /* Database Structure

    Table : advertising_messages
    +-------------------------+--------------+------+-----+---------------------+----------------+
    | Field                   | Type         | Null | Key | Default             | Extra          |
    +-------------------------+--------------+------+-----+---------------------+----------------+
    | message_id              | int(11)      | NO   | PRI | NULL                | auto_increment |
    | message_text            | varchar(255) | NO   |     | Non définie         |                |
    | schedule_time           | int(11)      | NO   |     | Non définie         |                |
    +-------------------------+--------------+------+-----+---------------------+----------------+
    */

    // Defines
    private int messageId;
    private String messageText;
    private int scheduleTime;

    // Constructor
    @ConstructorProperties({"messageId", "messageText", "scheduleTime"})
    public ScheduledMessageBean(int messageId, String messageText, int scheduleTime)
    {
        this.messageId = messageId;
        this.messageText = messageText;
        this.scheduleTime = scheduleTime;
    }

    // Getters
    public int getMessageId() { return this.messageId; }
    public String getMessageText() { return this.messageText; }
    public int getScheduleTime() { return this.scheduleTime; }

    // Setters
    public void setMessageText(String messageText) { this.messageText = messageText; }
    public void setScheduleTime(int scheduleTime) { this.scheduleTime = scheduleTime; }
}