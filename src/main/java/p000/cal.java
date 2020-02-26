package p000;

import android.content.SharedPreferences;
import android.content.pm.PackageStats;
import android.os.SystemClock;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;

/* renamed from: cal */
/* compiled from: PG */
final /* synthetic */ class cal implements Runnable {

    /* renamed from: a */
    private final cam f5126a;

    public cal(cam cam) {
        this.f5126a = cam;
    }

    public final void run() {
        cam cam = this.f5126a;
        SharedPreferences sharedPreferences = cam.f5128e;
        long j = cam.f5127d;
        cev.m4635b();
        long j2 = sharedPreferences.getLong("primes.packageMetric.lastSendTime", -1);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime < j2) {
            if (!sharedPreferences.edit().remove("primes.packageMetric.lastSendTime").commit()) {
                bog.m3832a("SamplingUtil", "Failure storing timestamp to SharedPreferences", new Object[0]);
            }
            j2 = -1;
        }
        if (j2 == -1 || elapsedRealtime > j2 + j) {
            PackageStats packageStats = PackageStatsCapture.getPackageStats(cam.f5025a);
            if (packageStats != null) {
                dja l = dom.f9077q.mo4516l();
                cev.m4629a(packageStats);
                dja l2 = doi.f9054k.mo4516l();
                long j3 = packageStats.cacheSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi = (doi) l2.f8672a;
                doi.f9055a |= 1;
                doi.f9056b = j3;
                long j4 = packageStats.codeSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi2 = (doi) l2.f8672a;
                doi2.f9055a |= 2;
                doi2.f9057c = j4;
                long j5 = packageStats.dataSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi3 = (doi) l2.f8672a;
                doi3.f9055a |= 4;
                doi3.f9058d = j5;
                long j6 = packageStats.externalCacheSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi4 = (doi) l2.f8672a;
                doi4.f9055a |= 8;
                doi4.f9059e = j6;
                long j7 = packageStats.externalCodeSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi5 = (doi) l2.f8672a;
                doi5.f9055a |= 16;
                doi5.f9060f = j7;
                long j8 = packageStats.externalDataSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi6 = (doi) l2.f8672a;
                doi6.f9055a |= 32;
                doi6.f9061g = j8;
                long j9 = packageStats.externalMediaSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi7 = (doi) l2.f8672a;
                doi7.f9055a |= 64;
                doi7.f9062h = j9;
                long j10 = packageStats.externalObbSize;
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                doi doi8 = (doi) l2.f8672a;
                doi8.f9055a |= 128;
                doi8.f9063i = j10;
                doi doi9 = (doi) l2.mo4509g();
                dja dja = (dja) doi9.mo4513b(5);
                dja.mo4366a((dje) doi9);
                if (l.f8673b) {
                    l.mo4505b();
                    l.f8673b = false;
                }
                dom dom = (dom) l.f8672a;
                doi doi10 = (doi) dja.mo4509g();
                doi10.getClass();
                dom.f9087j = doi10;
                dom.f9078a |= 256;
                cam.mo2544a((dom) l.mo4509g());
                SharedPreferences sharedPreferences2 = cam.f5128e;
                if (!sharedPreferences2.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit()) {
                    bog.m3832a("PackageMetricService", "Failure storing timestamp persistently", new Object[0]);
                    return;
                }
                return;
            }
            bog.m3837c("PackageMetricService", "PackageStats capture failed.", new Object[0]);
        }
    }
}
