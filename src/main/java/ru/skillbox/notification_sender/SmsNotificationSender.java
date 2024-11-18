package ru.skillbox.notification_sender;

import ru.skillbox.notification.SmsNotification;

import java.util.List;

public class SmsNotificationSender implements NotificationSender<SmsNotification> {
    @Override
    public void send(SmsNotification notification) {
        System.out.println("Отправка SMS: ");
        System.out.println("Номера телефонов: " +
                String.join(", ", notification.getPhoneNumbers()));
        System.out.println("Сообщение: " + notification.formattedMessage());
        System.out.println();
    }

    @Override
    public void send(List<SmsNotification> notifications) {
        for (SmsNotification notification : notifications) {
            send(notification);
        }
    }
}
