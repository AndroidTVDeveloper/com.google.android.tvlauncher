package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bsh  reason: default package */
/* compiled from: PG */
public final class bsh {
    public bsh(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
    }

    public bsh() {
    }

    public bsh(String[] strArr) {
        String[] strArr2 = (String[]) buh.a(strArr);
        new ArrayList();
        new HashMap();
    }

    public static bol a(Status status) {
        if (status.h != null) {
            return new bow(status);
        }
        return new bol(status);
    }
}
