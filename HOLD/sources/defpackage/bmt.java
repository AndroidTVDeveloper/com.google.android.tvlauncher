package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bmt  reason: default package */
/* compiled from: PG */
public final class bmt {
    private static final Lock a = new ReentrantLock();
    private static bmt b;
    private final Lock c = new ReentrantLock();
    private final SharedPreferences d;

    private bmt(Context context) {
        this.d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        this.c.lock();
        try {
            return this.d.getString(str, null);
        } finally {
            this.c.unlock();
        }
    }

    public static bmt a(Context context) {
        buh.a(context);
        a.lock();
        try {
            if (b == null) {
                b = new bmt(context.getApplicationContext());
            }
            return b;
        } finally {
            a.unlock();
        }
    }
}
