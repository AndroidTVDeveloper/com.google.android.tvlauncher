package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: ccv  reason: default package */
/* compiled from: PG */
public final class ccv {
    private static volatile boolean a;
    private static Method b;

    static {
        Pattern.compile("VmHWM:\\s*(\\d+)\\s*kB");
    }

    private ccv() {
    }

    public static dnr a(int i, Context context, String str) {
        int myPid = Process.myPid();
        cev.b();
        cev.a(context);
        Debug.MemoryInfo[] processMemoryInfo = ccx.a(context).getProcessMemoryInfo(new int[]{myPid});
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ccx.a(context).getMemoryInfo(memoryInfo);
        djb djb = (djb) dnr.h.l();
        dja l = dnp.c.l();
        Debug.MemoryInfo memoryInfo2 = processMemoryInfo[0];
        dja l2 = dnn.u.l();
        int i2 = memoryInfo2.dalvikPss;
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn = (dnn) l2.a;
        dnn.a |= 1;
        dnn.b = i2;
        int i3 = memoryInfo2.nativePss;
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn2 = (dnn) l2.a;
        dnn2.a |= 2;
        dnn2.c = i3;
        int i4 = memoryInfo2.otherPss;
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn3 = (dnn) l2.a;
        dnn3.a |= 4;
        dnn3.d = i4;
        int i5 = memoryInfo2.dalvikPrivateDirty;
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn4 = (dnn) l2.a;
        dnn4.a |= 8;
        dnn4.e = i5;
        int i6 = memoryInfo2.nativePrivateDirty;
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn5 = (dnn) l2.a;
        dnn5.a |= 16;
        dnn5.f = i6;
        int i7 = memoryInfo2.otherPrivateDirty;
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn6 = (dnn) l2.a;
        dnn6.a |= 32;
        dnn6.g = i7;
        int totalPss = memoryInfo2.getTotalPss();
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn7 = (dnn) l2.a;
        dnn7.a |= 64;
        dnn7.h = totalPss;
        int i8 = Build.VERSION.SDK_INT;
        int totalPrivateClean = memoryInfo2.getTotalPrivateClean();
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn8 = (dnn) l2.a;
        dnn8.a |= 128;
        dnn8.i = totalPrivateClean;
        int totalSwappablePss = memoryInfo2.getTotalSwappablePss();
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn9 = (dnn) l2.a;
        dnn9.a |= 512;
        dnn9.k = totalSwappablePss;
        int totalSharedDirty = memoryInfo2.getTotalSharedDirty();
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn10 = (dnn) l2.a;
        dnn10.a |= 256;
        dnn10.j = totalSharedDirty;
        int i9 = Build.VERSION.SDK_INT;
        int a2 = a(memoryInfo2);
        if (a2 != -1) {
            if (l2.b) {
                l2.b();
                l2.b = false;
            }
            dnn dnn11 = (dnn) l2.a;
            dnn11.a |= 1024;
            dnn11.l = a2;
        }
        int i10 = Build.VERSION.SDK_INT;
        try {
            Map<String, String> memoryStats = memoryInfo2.getMemoryStats();
            Integer a3 = a(memoryStats.get("summary.code"));
            if (a3 != null) {
                int intValue = a3.intValue();
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dnn dnn12 = (dnn) l2.a;
                dnn12.a |= 4096;
                dnn12.n = intValue;
            }
            Integer a4 = a(memoryStats.get("summary.stack"));
            if (a4 != null) {
                int intValue2 = a4.intValue();
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dnn dnn13 = (dnn) l2.a;
                dnn13.a |= 8192;
                dnn13.o = intValue2;
            }
            Integer a5 = a(memoryStats.get("summary.graphics"));
            if (a5 != null) {
                int intValue3 = a5.intValue();
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dnn dnn14 = (dnn) l2.a;
                dnn14.a |= 16384;
                dnn14.p = intValue3;
            }
            Integer a6 = a(memoryStats.get("summary.system"));
            if (a6 != null) {
                int intValue4 = a6.intValue();
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dnn dnn15 = (dnn) l2.a;
                dnn15.a |= 65536;
                dnn15.r = intValue4;
            }
            Integer a7 = a(memoryStats.get("summary.java-heap"));
            if (a7 != null) {
                int intValue5 = a7.intValue();
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dnn dnn16 = (dnn) l2.a;
                dnn16.a |= 2048;
                dnn16.m = intValue5;
            }
            Integer a8 = a(memoryStats.get("summary.private-other"));
            if (a8 != null) {
                int intValue6 = a8.intValue();
                if (l2.b) {
                    l2.b();
                    l2.b = false;
                }
                dnn dnn17 = (dnn) l2.a;
                dnn17.a |= 32768;
                dnn17.q = intValue6;
            }
        } catch (NumberFormatException e) {
            bog.d("PrimesMemoryCapture", "failed to collect memory summary stats", new Object[0]);
        }
        int i11 = (int) (memoryInfo.availMem >> 10);
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn18 = (dnn) l2.a;
        dnn18.a |= 131072;
        dnn18.s = i11;
        int i12 = (int) (memoryInfo.totalMem >> 20);
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dnn dnn19 = (dnn) l2.a;
        dnn19.a |= 262144;
        dnn19.t = i12;
        dnn dnn20 = (dnn) l2.g();
        if (l.b) {
            l.b();
            l.b = false;
        }
        dnp dnp = (dnp) l.a;
        dnn20.getClass();
        dnp.b = dnn20;
        dnp.a |= 1;
        if (djb.b) {
            djb.b();
            djb.b = false;
        }
        dnr dnr = (dnr) djb.a;
        dnp dnp2 = (dnp) l.g();
        dnp2.getClass();
        dnr.c = dnp2;
        dnr.b |= 1;
        dja l3 = doa.c.l();
        dnz a9 = ccy.a(context);
        if (l3.b) {
            l3.b();
            l3.b = false;
        }
        doa doa = (doa) l3.a;
        a9.getClass();
        doa.b = a9;
        doa.a |= 1;
        if (djb.b) {
            djb.b();
            djb.b = false;
        }
        dnr dnr2 = (dnr) djb.a;
        doa doa2 = (doa) l3.g();
        doa2.getClass();
        dnr2.d = doa2;
        dnr2.b |= 2;
        dja l4 = dno.c.l();
        boolean c = ccx.c(context);
        if (l4.b) {
            l4.b();
            l4.b = false;
        }
        dno dno = (dno) l4.a;
        dno.a = 1 | dno.a;
        dno.b = c;
        if (djb.b) {
            djb.b();
            djb.b = false;
        }
        dnr dnr3 = (dnr) djb.a;
        dno dno2 = (dno) l4.g();
        dno2.getClass();
        dnr3.f = dno2;
        dnr3.b |= 8;
        if (djb.b) {
            djb.b();
            djb.b = false;
        }
        dnr dnr4 = (dnr) djb.a;
        dnr4.e = i - 1;
        int i13 = dnr4.b | 4;
        dnr4.b = i13;
        if (str != null) {
            str.getClass();
            dnr4.b = i13 | 16;
            dnr4.g = str;
        }
        return (dnr) djb.g();
    }

    private static int a(Debug.MemoryInfo memoryInfo) {
        Method a2 = a();
        if (a2 == null) {
            return -1;
        }
        try {
            return ((Integer) a2.invoke(memoryInfo, 14)).intValue();
        } catch (Error | Exception e) {
            b = null;
            bog.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e, new Object[0]);
            return -1;
        }
    }

    private static Method a() {
        if (!a) {
            synchronized (ccv.class) {
                if (!a) {
                    try {
                        b = Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE);
                    } catch (NoSuchMethodException e) {
                        bog.a("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) not found", e, new Object[0]);
                    } catch (Error | Exception e2) {
                        bog.c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e2, new Object[0]);
                    }
                    a = true;
                }
            }
        }
        return b;
    }

    private static Integer a(String str) {
        if (str != null) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        return null;
    }
}
