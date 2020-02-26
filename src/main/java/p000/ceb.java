package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: ceb */
/* compiled from: PG */
public final class ceb {

    /* renamed from: a */
    private static volatile dfc f5349a = dez.f8438a;

    /* renamed from: b */
    private static final Object f5350b = new Object();

    /* renamed from: a */
    public static boolean m4599a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        } else if (f5349a.mo4219a()) {
            return ((Boolean) f5349a.mo4220b()).booleanValue();
        } else {
            synchronized (f5350b) {
                if (f5349a.mo4219a()) {
                    boolean booleanValue = ((Boolean) f5349a.mo4220b()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                    }
                    f5349a = dfc.m6291a(Boolean.valueOf(z));
                    return ((Boolean) f5349a.mo4220b()).booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
                f5349a = dfc.m6291a(Boolean.valueOf(z));
                return ((Boolean) f5349a.mo4220b()).booleanValue();
            }
        }
    }
}
