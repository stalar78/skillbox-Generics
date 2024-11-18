package ru.skillbox.notification;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class EmailNotification implements Notification {
    private final String subject;
    private final List<String> recipients;
    private final String message;

    @Override
    public String formattedMessage() {
        return "<p>" + message + "/p>";
    }

}


