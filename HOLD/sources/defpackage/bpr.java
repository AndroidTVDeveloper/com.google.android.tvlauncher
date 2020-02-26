package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: bpr  reason: default package */
/* compiled from: PG */
public final class bpr extends bvm {
    public bpr() {
        super(Looper.getMainLooper());
    }

    public bpr(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            Pair pair = (Pair) message.obj;
            boy boy = (boy) pair.first;
            box box = (box) pair.second;
            try {
                boy.a(box);
            } catch (RuntimeException e) {
                BasePendingResult.b(box);
                throw e;
            }
        } else if (i != 2) {
            int i2 = message.what;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Don't know how to handle message: ");
            sb.append(i2);
            Log.wtf("BasePendingResult", sb.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).c(Status.d);
        }
    }

    public final void a(boy boy, box box) {
        int i = BasePendingResult.g;
        sendMessage(obtainMessage(1, new Pair(boy, box)));
    }
}
