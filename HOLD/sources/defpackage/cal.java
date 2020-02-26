package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;

/* renamed from: cal  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cal implements Runnable {
    private final cam a;

    public cal(cam cam) {
        this.a = cam;
    }

    public final void run() {
        cam cam = this.a;
        SharedPreferences sharedPreferences = cam.e;
        long j = cam.d;
        cev.b();
        long j2 = sharedPreferences.getLong("primes.packageMetric.lastSendTime", -1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < j2) {
            if (!sharedPreferences.edit().remove("primes.packageMetric.lastSendTime").commit()) {
                bog.a("SamplingUtil", "Failure storing timestamp to SharedPreferences", new Object[0]);
            }
            j2 = -1;
        }
        if (j2 == -1 || elapsedRealtime > j2 + j) {
            PackageStats packageStats = PackageStatsCapture.getPackageStats(cam.a);
            if (packageStats != null) {
                dja l = dom.q.l();
                cev.a(packageStats);
                dja l2 = doi.k.l();
                long j3 = packageStats.cacheSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi = (doi) l2.a;
                doi.a |= 1;
                doi.b = j3;
                long j4 = packageStats.codeSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi2 = (doi) l2.a;
                doi2.a |= 2;
                doi2.c = j4;
                long j5 = packageStats.dataSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi3 = (doi) l2.a;
                doi3.a |= 4;
                doi3.d = j5;
                long j6 = packageStats.externalCacheSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi4 = (doi) l2.a;
                doi4.a |= 8;
                doi4.e = j6;
                long j7 = packageStats.externalCodeSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi5 = (doi) l2.a;
                doi5.a |= 16;
                doi5.f = j7;
                long j8 = packageStats.externalDataSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi6 = (doi) l2.a;
                doi6.a |= 32;
                doi6.g = j8;
                long j9 = packageStats.externalMediaSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi7 = (doi) l2.a;
                doi7.a |= 64;
                doi7.h = j9;
                long j10 = packageStats.externalObbSize;
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                doi doi8 = (doi) l2.a;
                doi8.a |= 128;
                doi8.i = j10;
                doi doi9 = (doi) l2.g();
                dja dja = (dja) doi9.b(5);
                dja.a((dje) doi9);
                if (l.b) {
                    l.b();
                    l.b = false;
                }
                dom dom = (dom) l.a;
                doi doi10 = (doi) dja.g();
                doi10.getClass();
                dom.j = doi10;
                dom.a |= 256;
                cam.a((dom) l.g());
                SharedPreferences sharedPreferences2 = cam.e;
                if (!sharedPreferences2.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
                    bog.a("PackageMetricService", "Failure storing timestamp persistently", new Object[0]);
                    return;
                }
                return;
            }
            bog.c("PackageMetricService", "PackageStats capture failed.", new Object[0]);
        }
    }
}
