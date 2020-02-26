package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: aq  reason: default package */
/* compiled from: PG */
public final class aq {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public CharSequence d;
    public CharSequence e;
    public PendingIntent f;
    public int g;
    public ar h;
    public boolean i = false;
    public Bundle j;
    public String k;
    public final Notification l;
    @Deprecated
    public final ArrayList m;

    @Deprecated
    public aq(Context context) {
        Notification notification = new Notification();
        this.l = notification;
        this.a = context;
        this.k = null;
        notification.when = System.currentTimeMillis();
        this.l.audioStreamType = -1;
        this.g = 0;
        this.m = new ArrayList();
    }

    public final Bundle a() {
        if (this.j == null) {
            this.j = new Bundle();
        }
        return this.j;
    }

    public static CharSequence a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }
        return null;
    }

    public final void a(int i2) {
        this.l.icon = i2;
    }

    public final void a(ar arVar) {
        if (this.h != arVar) {
            this.h = arVar;
            if (arVar != null && arVar.a != this) {
                arVar.a = this;
                aq aqVar = arVar.a;
                if (aqVar != null) {
                    aqVar.a(arVar);
                }
            }
        }
    }
}
