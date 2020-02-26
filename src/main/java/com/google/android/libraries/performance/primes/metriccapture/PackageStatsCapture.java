package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class PackageStatsCapture {
    public static final PackageStatsInvocation[] GETTER_INVOCATIONS = {new PackageStatsInvocation("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class}), new PackageStatsInvocation("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class}), new PackageStatsInvocation("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class})};

    /* compiled from: PG */
    final class PackageStatsCallback extends IPackageStatsObserver.Stub {

        /* renamed from: a */
        public final Semaphore f6359a = new Semaphore(1);

        /* renamed from: b */
        public volatile PackageStats f6360b;

        private PackageStatsCallback() {
        }

        public /* synthetic */ PackageStatsCallback(byte b) {
        }

        public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (z) {
                String valueOf = String.valueOf(packageStats);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Success getting PackageStats: ");
                sb.append(valueOf);
                bog.m3832a("PackageStatsCapture", sb.toString(), new Object[0]);
                this.f6360b = packageStats;
            } else {
                bog.m3837c("PackageStatsCapture", "Failure getting PackageStats", new Object[0]);
            }
            this.f6359a.release();
        }
    }

    private PackageStatsCapture() {
    }

    /* compiled from: PG */
    final class PackageStatsInvocation {

        /* renamed from: a */
        private final String f6361a;

        /* renamed from: b */
        private final Class[] f6362b;

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.f6361a = str;
            this.f6362b = clsArr;
        }

        public boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            Object[] objArr;
            try {
                Method method = packageManager.getClass().getMethod(this.f6361a, this.f6362b);
                Class<IPackageStatsObserver>[] clsArr = this.f6362b;
                int length = clsArr.length;
                if (length == 2) {
                    if (clsArr[0] == String.class && clsArr[1] == IPackageStatsObserver.class) {
                        objArr = new Object[]{str, iPackageStatsObserver};
                    }
                    throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
                }
                if (length == 3 && clsArr[0] == String.class && clsArr[1] == Integer.TYPE && this.f6362b[2] == IPackageStatsObserver.class) {
                    objArr = new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
                }
                throw new IllegalArgumentException("Invalid parameter for PackageStatsInvocation.");
                method.invoke(packageManager, objArr);
                return true;
            } catch (NoSuchMethodException e) {
                bog.m3831a("PackageStatsCapture", "PackageStats getter not found", e, new Object[0]);
                return false;
            } catch (Error | Exception e2) {
                bog.m3835b("PackageStatsCapture", e2.getClass().getSimpleName() + " for " + this.f6361a + '(' + Arrays.asList(this.f6362b) + ") invocation", new Object[0]);
                return false;
            }
        }
    }

    public static PackageStats getPackageStats(Context context) {
        cev.m4635b();
        int i = Build.VERSION.SDK_INT;
        return ccw.m4547a(context);
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        if (!m5240a()) {
            bog.m3837c("PackageStatsCapture", "Callback implementation stripped by proguard.", new Object[0]);
            return null;
        }
        PackageStatsCallback packageStatsCallback = new PackageStatsCallback((byte) 0);
        try {
            packageStatsCallback.f6359a.acquire();
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            int myUid = Process.myUid();
            for (PackageStatsInvocation invoke : packageStatsInvocationArr) {
                if (invoke.invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                    bog.m3835b("PackageStatsCapture", "Success invoking PackageStats capture.", new Object[0]);
                    if (packageStatsCallback.f6359a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                        return packageStatsCallback.f6360b;
                    }
                    bog.m3837c("PackageStatsCapture", "Timeout while waiting for PackageStats callback", new Object[0]);
                    return null;
                }
            }
            bog.m3837c("PackageStatsCapture", "Couldn't capture PackageStats.", new Object[0]);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m5240a() {
        try {
            return !Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", PackageStats.class, Boolean.TYPE).getModifiers());
        } catch (Error | Exception e) {
            bog.m3831a("PackageStatsCapture", "failure", e, new Object[0]);
            return false;
        }
    }
}
