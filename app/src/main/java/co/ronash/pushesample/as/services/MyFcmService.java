package co.ronash.pushesample.as.services;



import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import co.pushe.plus.Pushe;
import co.pushe.plus.fcm.FcmHandler;
import co.pushe.plus.fcm.PusheFCM;


public class MyFcmService extends FirebaseMessagingService {

    private FcmHandler fcmHandler = Pushe.getPusheService(PusheFCM.class).getFcmHandler();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("P_AS", "Message received: \n" + remoteMessage.getData());
        if (fcmHandler.onMessageReceived(remoteMessage)) {
            // Message is for Pushe
            return;
        }
        super.onMessageReceived(remoteMessage);

        // Handle Firebase message
    }

    @Override
    public void onNewToken(String s) {
        fcmHandler.onNewToken(s);
        super.onNewToken(s);

        // Token is refreshed
    }

    @Override
    public void onMessageSent(String s) {
        fcmHandler.onMessageSent(s);
        super.onMessageSent(s);

        // Message sent
    }

    @Override
    public void onDeletedMessages() {
        fcmHandler.onDeletedMessages();
        super.onDeletedMessages();

        // Message was deleted
    }

    @Override
    public void onSendError(String s, Exception e) {
        fcmHandler.onSendError(s, e);
        super.onSendError(s, e);

        // Error sent
    }
}
