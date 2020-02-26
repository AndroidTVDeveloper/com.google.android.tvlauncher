package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: ceb  reason: default package */
/* compiled from: PG */
public final class ceb {
    private static volatile dfc a = dez.a;
    private static final Object b = new Object();

    public static boolean a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        } else if (a.a()) {
            return ((Boolean) a.b()).booleanValue();
        } else {
            synchronized (b) {
                if (a.a()) {
                    boolean booleanValue = ((Boolean) a.b()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                    }
                    a = dfc.a(Boolean.valueOf(z));
                    return ((Boolean) a.b()).booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
                a = dfc.a(Boolean.valueOf(z));
                return ((Boolean) a.b()).booleanValue();
            }
        }
    }
}
