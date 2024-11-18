package ru.skillbox.notification_sender;

import ru.skillbox.notification.PushNotification;

import java.util.List;

public class PushNotificationSender implements NotificationSender<PushNotification> {
    @Override
    public void send(PushNotification notification) {
        System.out.println("Отправка Push-уведомления: ");
        System.out.println("Заголовок: " + notification.getTitle());
        System.out.println("Аккаунт: " + notification.getUserAccount());
        System.out.println("Сообщение: " + notification.formattedMessage());
    }

    @Override
    public void send(List<PushNotification> notifications) {
        for (PushNotification notification : notifications) {
            send(notification);
        }
    }
}
