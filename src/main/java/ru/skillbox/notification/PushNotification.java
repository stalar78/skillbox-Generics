package ru.skillbox.notification;
import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class PushNotification implements Notification{
    private final String title;
    private final String userAccount;
    private final String message;

    @Override
    public String formattedMessage() {
        return "\uD83D\uDC4B " + message;
    }
}
