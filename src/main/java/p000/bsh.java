package p000;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bsh */
/* compiled from: PG */
public final class bsh {
    public bsh(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
    }

    public bsh() {
    }

    public bsh(String[] strArr) {
        String[] strArr2 = (String[]) buh.m4199a(strArr);
        new ArrayList();
        new HashMap();
    }

    /* renamed from: a */
    public static bol m4093a(Status status) {
        if (status.f6267h != null) {
            return new bow(status);
        }
        return new bol(status);
    }
}
