package ru.skillbox.notification_sender;

import ru.skillbox.notification.EmailNotification;

import java.util.List;

public class EmailNotificationSender implements NotificationSender<EmailNotification> {
    @Override
    public void send(EmailNotification notification) {
        System.out.println("Отправка Email: ");
        System.out.println("Тема: " + notification.getSubject());
        System.out.println("Получатели: " + notification.getRecipients());
        System.out.println("Сообщение: " + notification.formattedMessage());
    }

    @Override
    public void send(List<EmailNotification> notifications) {
        for (EmailNotification notification : notifications) {
            send(notification);
        }
    }
}
