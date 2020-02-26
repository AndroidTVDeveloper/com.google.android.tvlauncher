package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* renamed from: aax */
/* compiled from: PG */
public final class aax implements aaj {

    /* renamed from: a */
    private final aaj f39a;

    /* renamed from: b */
    private final Resources f40b;

    public aax(Resources resources, aaj aaj) {
        this.f40b = resources;
        this.f39a = aaj;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        Uri a = m41a((Integer) obj);
        if (a != null) {
            return this.f39a.mo11a(a, i, i2, txVar);
        }
        return null;
    }

    /* renamed from: a */
    private final Uri m41a(Integer num) {
        try {
            String resourcePackageName = this.f40b.getResourcePackageName(num.intValue());
            String resourceTypeName = this.f40b.getResourceTypeName(num.intValue());
            String resourceEntryName = this.f40b.getResourceEntryName(num.intValue());
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

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
