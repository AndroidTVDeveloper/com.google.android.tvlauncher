package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* renamed from: aax  reason: default package */
/* compiled from: PG */
public final class aax implements aaj {
    private final aaj a;
    private final Resources b;

    public aax(Resources resources, aaj aaj) {
        this.b = resources;
        this.a = aaj;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        Uri a2 = a((Integer) obj);
        if (a2 != null) {
            return this.a.a(a2, i, i2, txVar);
        }
        return null;
    }

    private final Uri a(Integer num) {
        try {
            String resourcePackageName = this.b.getResourcePackageName(num.intValue());
            String resourceTypeName = this.b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.b.getResourceEntryName(num.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(resourcePackageName).length() + 21 + String.valueOf(resourceTypeName).length() + String.valueOf(resourceEntryName).length());
            sb.append("android.resource://");
            sb.append(resourcePackageName);
            sb.append('/');
            sb.append(resourceTypeName);
            sb.append('/');
            sb.append(resourceEntryName);
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            String valueOf = String.valueOf(num);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("Received invalid resource id: ");
            sb2.append(valueOf);
            Log.w("ResourceLoader", sb2.toString(), e);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
