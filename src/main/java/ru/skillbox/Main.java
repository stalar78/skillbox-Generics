package ru.skillbox;

import ru.skillbox.notification.*;
import ru.skillbox.notification_sender.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailNotification email1 = new EmailNotification(
                "Успешная регистрация!",
                List.of("skillbox1@mail.ru", "skillbox2@mail.ru"),
                "Спасибо за регистрацию на сервисе!"
        );

        EmailNotification email2 = new EmailNotification(
                "Успей приобрести курс по скидке!",
                List.of("skillbox3@mail.ru"),
                "До 50% + курс в подарок!"
        );
        EmailNotification email3 = new EmailNotification(
                "Пройдите тест!",
                List.of("skillbox4@mail.ru"),
                "Нам очень важно ваше мнение!"
        );

        PushNotification push1 = new PushNotification(
                "Регистрация пройдена",
                "skillbox-1",
                "Подтвердите почту"
        );
        PushNotification push2 = new PushNotification(
                "Осузествлен вход в систему",
                "skillbox_2",
                "Проверьте ваши параметры."
        );
        PushNotification push3 = new PushNotification(
                "Поздравляем с прохождением модуля!",
                "skillbox_3",
                "Переходите к просмотру следующего модуля"
        );

        SmsNotification sms1 = new SmsNotification(
                List.of("+70001234567"),
                "Код верификации 1234."
        );
        SmsNotification sms2 = new SmsNotification(
                List.of("+70007654321"),
                "Осуществлен вход в истему."
        );
        SmsNotification sms3 = new SmsNotification(
                List.of("+70009876543"),
                "Вам открыт доступ к следующему курсу."
        );

        // Создаем сервисы
        EmailNotificationSender emailSender = new EmailNotificationSender();
        PushNotificationSender pushSender = new PushNotificationSender();
        SmsNotificationSender smsSender = new SmsNotificationSender();

        // Отправляем уведомления
        System.out.println("=== Sending Individual Notifications ===");
        emailSender.send(email1);
        System.out.println();
        pushSender.send(push1);
        System.out.println();
        smsSender.send(sms1);

        System.out.println("=== Sending Batch Notifications ===");
        emailSender.send(Arrays.asList(email1, email2, email3));
        System.out.println();
        pushSender.send(Arrays.asList(push1, push2, push3));
        System.out.println();
        smsSender.send(Arrays.asList(sms1, sms2, sms3));
    }
}
