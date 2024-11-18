package ru.skillbox.notification;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class SmsNotification implements Notification {
    private final List<String> phoneNumbers;
    private final String message;

    @Override
    public String formattedMessage() {
        return message;
    }
}
