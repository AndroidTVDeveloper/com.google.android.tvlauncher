package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: ccv */
/* compiled from: PG */
public final class ccv {

    /* renamed from: a */
    private static volatile boolean f5289a;

    /* renamed from: b */
    private static Method f5290b;

    static {
        Pattern.compile("VmHWM:\\s*(\\d+)\\s*kB");
    }

    private ccv() {
    }

    /* renamed from: a */
    public static dnr m4544a(int i, Context context, String str) {
        int myPid = Process.myPid();
        cev.m4635b();
        cev.m4629a(context);
        Debug.MemoryInfo[] processMemoryInfo = ccx.m4548a(context).getProcessMemoryInfo(new int[]{myPid});
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ccx.m4548a(context).getMemoryInfo(memoryInfo);
        djb djb = (djb) dnr.f8984h.mo4516l();
        dja l = dnp.f8980c.mo4516l();
        Debug.MemoryInfo memoryInfo2 = processMemoryInfo[0];
        dja l2 = dnn.f8956u.mo4516l();
        int i2 = memoryInfo2.dalvikPss;
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn = (dnn) l2.f8672a;
        dnn.f8957a |= 1;
        dnn.f8958b = i2;
        int i3 = memoryInfo2.nativePss;
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn2 = (dnn) l2.f8672a;
        dnn2.f8957a |= 2;
        dnn2.f8959c = i3;
        int i4 = memoryInfo2.otherPss;
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn3 = (dnn) l2.f8672a;
        dnn3.f8957a |= 4;
        dnn3.f8960d = i4;
        int i5 = memoryInfo2.dalvikPrivateDirty;
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn4 = (dnn) l2.f8672a;
        dnn4.f8957a |= 8;
        dnn4.f8961e = i5;
        int i6 = memoryInfo2.nativePrivateDirty;
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn5 = (dnn) l2.f8672a;
        dnn5.f8957a |= 16;
        dnn5.f8962f = i6;
        int i7 = memoryInfo2.otherPrivateDirty;
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn6 = (dnn) l2.f8672a;
        dnn6.f8957a |= 32;
        dnn6.f8963g = i7;
        int totalPss = memoryInfo2.getTotalPss();
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn7 = (dnn) l2.f8672a;
        dnn7.f8957a |= 64;
        dnn7.f8964h = totalPss;
        int i8 = Build.VERSION.SDK_INT;
        int totalPrivateClean = memoryInfo2.getTotalPrivateClean();
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn8 = (dnn) l2.f8672a;
        dnn8.f8957a |= 128;
        dnn8.f8965i = totalPrivateClean;
        int totalSwappablePss = memoryInfo2.getTotalSwappablePss();
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn9 = (dnn) l2.f8672a;
        dnn9.f8957a |= 512;
        dnn9.f8967k = totalSwappablePss;
        int totalSharedDirty = memoryInfo2.getTotalSharedDirty();
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn10 = (dnn) l2.f8672a;
        dnn10.f8957a |= 256;
        dnn10.f8966j = totalSharedDirty;
        int i9 = Build.VERSION.SDK_INT;
        int a = m4543a(memoryInfo2);
        if (a != -1) {
            if (l2.f8673b) {
                l2.mo4505b();
                l2.f8673b = false;
            }
            dnn dnn11 = (dnn) l2.f8672a;
            dnn11.f8957a |= 1024;
            dnn11.f8968l = a;
        }
        int i10 = Build.VERSION.SDK_INT;
        try {
            Map<String, String> memoryStats = memoryInfo2.getMemoryStats();
            Integer a2 = m4545a(memoryStats.get("summary.code"));
            if (a2 != null) {
                int intValue = a2.intValue();
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dnn dnn12 = (dnn) l2.f8672a;
                dnn12.f8957a |= 4096;
                dnn12.f8970n = intValue;
            }
            Integer a3 = m4545a(memoryStats.get("summary.stack"));
            if (a3 != null) {
                int intValue2 = a3.intValue();
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dnn dnn13 = (dnn) l2.f8672a;
                dnn13.f8957a |= 8192;
                dnn13.f8971o = intValue2;
            }
            Integer a4 = m4545a(memoryStats.get("summary.graphics"));
            if (a4 != null) {
                int intValue3 = a4.intValue();
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dnn dnn14 = (dnn) l2.f8672a;
                dnn14.f8957a |= 16384;
                dnn14.f8972p = intValue3;
            }
            Integer a5 = m4545a(memoryStats.get("summary.system"));
            if (a5 != null) {
                int intValue4 = a5.intValue();
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dnn dnn15 = (dnn) l2.f8672a;
                dnn15.f8957a |= 65536;
                dnn15.f8974r = intValue4;
            }
            Integer a6 = m4545a(memoryStats.get("summary.java-heap"));
            if (a6 != null) {
                int intValue5 = a6.intValue();
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dnn dnn16 = (dnn) l2.f8672a;
                dnn16.f8957a |= 2048;
                dnn16.f8969m = intValue5;
            }
            Integer a7 = m4545a(memoryStats.get("summary.private-other"));
            if (a7 != null) {
                int intValue6 = a7.intValue();
                if (l2.f8673b) {
                    l2.mo4505b();
                    l2.f8673b = false;
                }
                dnn dnn17 = (dnn) l2.f8672a;
                dnn17.f8957a |= 32768;
                dnn17.f8973q = intValue6;
            }
        } catch (NumberFormatException e) {
            bog.m3838d("PrimesMemoryCapture", "failed to collect memory summary stats", new Object[0]);
        }
        int i11 = (int) (memoryInfo.availMem >> 10);
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn18 = (dnn) l2.f8672a;
        dnn18.f8957a |= 131072;
        dnn18.f8975s = i11;
        int i12 = (int) (memoryInfo.totalMem >> 20);
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dnn dnn19 = (dnn) l2.f8672a;
        dnn19.f8957a |= 262144;
        dnn19.f8976t = i12;
        dnn dnn20 = (dnn) l2.mo4509g();
        if (l.f8673b) {
            l.mo4505b();
            l.f8673b = false;
        }
        dnp dnp = (dnp) l.f8672a;
        dnn20.getClass();
        dnp.f8982b = dnn20;
        dnp.f8981a |= 1;
        if (djb.f8673b) {
            djb.mo4505b();
            djb.f8673b = false;
        }
        dnr dnr = (dnr) djb.f8672a;
        dnp dnp2 = (dnp) l.mo4509g();
        dnp2.getClass();
        dnr.f8986c = dnp2;
        dnr.f8985b |= 1;
        dja l3 = doa.f9022c.mo4516l();
        dnz a8 = ccy.m4553a(context);
        if (l3.f8673b) {
            l3.mo4505b();
            l3.f8673b = false;
        }
        doa doa = (doa) l3.f8672a;
        a8.getClass();
        doa.f9024b = a8;
        doa.f9023a |= 1;
        if (djb.f8673b) {
            djb.mo4505b();
            djb.f8673b = false;
        }
        dnr dnr2 = (dnr) djb.f8672a;
        doa doa2 = (doa) l3.mo4509g();
        doa2.getClass();
        dnr2.f8987d = doa2;
        dnr2.f8985b |= 2;
        dja l4 = dno.f8977c.mo4516l();
        boolean c = ccx.m4550c(context);
        if (l4.f8673b) {
            l4.mo4505b();
            l4.f8673b = false;
        }
        dno dno = (dno) l4.f8672a;
        dno.f8978a = 1 | dno.f8978a;
        dno.f8979b = c;
        if (djb.f8673b) {
            djb.mo4505b();
            djb.f8673b = false;
        }
        dnr dnr3 = (dnr) djb.f8672a;
        dno dno2 = (dno) l4.mo4509g();
        dno2.getClass();
        dnr3.f8989f = dno2;
        dnr3.f8985b |= 8;
        if (djb.f8673b) {
            djb.mo4505b();
            djb.f8673b = false;
        }
        dnr dnr4 = (dnr) djb.f8672a;
        dnr4.f8988e = i - 1;
        int i13 = dnr4.f8985b | 4;
        dnr4.f8985b = i13;
        if (str != null) {
            str.getClass();
            dnr4.f8985b = i13 | 16;
            dnr4.f8990g = str;
        }
        return (dnr) djb.mo4509g();
    }

    /* renamed from: a */
    private static int m4543a(Debug.MemoryInfo memoryInfo) {
        Method a = m4546a();
        if (a == null) {
            return -1;
        }
        try {
            return ((Integer) a.invoke(memoryInfo, 14)).intValue();
        } catch (Error | Exception e) {
            f5290b = null;
            bog.m3836c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e, new Object[0]);
            return -1;
        }
    }

    /* renamed from: a */
    private static Method m4546a() {
        if (!f5289a) {
            synchronized (ccv.class) {
                if (!f5289a) {
                    try {
                        f5290b = Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE);
                    } catch (NoSuchMethodException e) {
                        bog.m3831a("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) not found", e, new Object[0]);
                    } catch (Error | Exception e2) {
                        bog.m3836c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e2, new Object[0]);
                    }
                    f5289a = true;
                }
            }
        }
        return f5290b;
    }

    /* renamed from: a */
    private static Integer m4545a(String str) {
        if (str != null) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        return null;
    }
}
