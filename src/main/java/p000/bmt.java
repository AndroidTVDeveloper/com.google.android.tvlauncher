package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bmt */
/* compiled from: PG */
public final class bmt {

    /* renamed from: a */
    private static final Lock f4423a = new ReentrantLock();

    /* renamed from: b */
    private static bmt f4424b;

    /* renamed from: c */
    private final Lock f4425c = new ReentrantLock();

    /* renamed from: d */
    private final SharedPreferences f4426d;

    private bmt(Context context) {
        this.f4426d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public final String mo2160a(String str) {
        this.f4425c.lock();
        try {
            return this.f4426d.getString(str, null);
        } finally {
            this.f4425c.unlock();
        }
    }

    /* renamed from: a */
    public static bmt m3775a(Context context) {
        buh.m4199a(context);
        f4423a.lock();
        try {
            if (f4424b == null) {
                f4424b = new bmt(context.getApplicationContext());
            }
            return f4424b;
        } finally {
            f4423a.unlock();
        }
    }
}
