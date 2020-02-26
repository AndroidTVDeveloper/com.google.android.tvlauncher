package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: dky  reason: default package */
/* compiled from: PG */
final class dky {
    public static final dlw a = a(false);
    public static final dlw b = a(true);
    public static final dlw c = new dlw((byte) 0);
    private static final Class d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        d = cls;
    }

    static int c(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * din.i(i);
        }
        return 0;
    }

    static int j(List list) {
        return list.size();
    }

    static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a2 = size * din.a(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            a2 += din.a((dik) list.get(i2));
        }
        return a2;
    }

    static int d(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return d(list) + (size * din.a(i));
        }
        return 0;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djf) {
            djf djf = (djf) list;
            int i2 = 0;
            while (i < size) {
                i2 += din.b(djf.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += din.b(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    static int e(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * din.k(i);
        }
        return 0;
    }

    static int h(List list) {
        return list.size() << 2;
    }

    static int f(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * din.l(i);
        }
        return 0;
    }

    static int i(List list) {
        return list.size() << 3;
    }

    static int b(int i, List list, dkw dkw) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += din.a(i, (dkk) list.get(i3), dkw);
        }
        return i2;
    }

    static int g(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return e(list) + (size * din.a(i));
        }
        return 0;
    }

    static int e(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djf) {
            djf djf = (djf) list;
            i = 0;
            while (i2 < size) {
                i += din.b(djf.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int h(int i, List list) {
        if (list.size() != 0) {
            return a(list) + (list.size() * din.a(i));
        }
        return 0;
    }

    static int a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djy) {
            djy djy = (djy) list;
            int i2 = 0;
            while (i < size) {
                i2 += din.a(djy.c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += din.a(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    static int a(int i, Object obj, dkw dkw) {
        if (obj instanceof djs) {
            return din.a(i, (djs) obj);
        }
        return din.a(i) + din.a((dkk) obj, dkw);
    }

    static int a(int i, List list, dkw dkw) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a2 = din.a(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof djs) {
                i2 = din.a((djs) obj);
            } else {
                i2 = din.a((dkk) obj, dkw);
            }
            a2 += i2;
        }
        return a2;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return g(list) + (size * din.a(i));
        }
        return 0;
    }

    static int g(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djf) {
            djf djf = (djf) list;
            i = 0;
            while (i2 < size) {
                i += din.d(djf.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.d(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return c(list) + (size * din.a(i));
        }
        return 0;
    }

    static int c(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djy) {
            djy djy = (djy) list;
            i = 0;
            while (i2 < size) {
                i += din.b(djy.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int a(int i, List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int a2 = din.a(i) * size;
        if (!(list instanceof dju)) {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof dik) {
                    i2 = din.a((dik) obj);
                } else {
                    i2 = din.a((String) obj);
                }
                a2 += i2;
                i3++;
            }
        } else {
            dju dju = (dju) list;
            while (i3 < size) {
                Object c2 = dju.c(i3);
                a2 += c2 instanceof dik ? din.a((dik) c2) : din.a((String) c2);
                i3++;
            }
        }
        return a2;
    }

    static int k(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return f(list) + (size * din.a(i));
        }
        return 0;
    }

    static int f(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djf) {
            djf djf = (djf) list;
            i = 0;
            while (i2 < size) {
                i += din.c(djf.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.c(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int l(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return b(list) + (size * din.a(i));
        }
        return 0;
    }

    static int b(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djy) {
            djy djy = (djy) list;
            i = 0;
            while (i2 < size) {
                i += din.a(djy.c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.a(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static Object a(int i, List list, djh djh, Object obj) {
        if (djh == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!djh.a(intValue)) {
                    obj = a(i, intValue, obj);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        Object obj2 = obj;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int intValue2 = ((Integer) list.get(i3)).intValue();
            if (!djh.a(intValue2)) {
                obj2 = a(i, intValue2, obj2);
            } else {
                if (i3 != i2) {
                    list.set(i2, Integer.valueOf(intValue2));
                }
                i2++;
            }
        }
        if (i2 == size) {
            return obj2;
        }
        list.subList(i2, size).clear();
        return obj2;
    }

    private static dlw a(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (dlw) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable th2) {
            }
        }
        return null;
    }

    static void b(Object obj, Object obj2) {
        div a2 = dkc.a(obj2);
        if (!a2.a()) {
            div a3 = ((djc) obj).a();
            for (int i = 0; i < a2.a.b(); i++) {
                a3.a(a2.a.b(i));
            }
            for (Map.Entry a4 : a2.a.c()) {
                a3.a(a4);
            }
        }
    }

    static void a(dke dke, Object obj, Object obj2, long j) {
        dlv.a(obj, j, dke.a(dlv.f(obj, j), dlv.f(obj2, j)));
    }

    static void c(Object obj, Object obj2) {
        dlm a2 = dlw.a(obj);
        dlm a3 = dlw.a(obj2);
        if (!a3.equals(dlm.a)) {
            a2 = dlm.a(a2, a3);
        }
        dlw.a(obj, a2);
    }

    public static void a(Class cls) {
        Class cls2;
        if (!dje.class.isAssignableFrom(cls) && (cls2 = d) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private static Object a(int i, int i2, Object obj) {
        if (obj == null) {
            obj = dlm.a();
        }
        ((dlm) obj).a(dme.a(i, 0), Long.valueOf((long) i2));
        return obj;
    }

    public static void n(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3 += din.b();
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, dmf dmf) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((dio) dmf).a.b(i, (dik) list.get(i2));
            }
        }
    }

    public static void a(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += din.c();
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.e(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    public static void m(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.b(((Integer) list.get(i4)).intValue());
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.f(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void k(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += din.d();
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void f(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += din.e();
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += din.f();
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.h(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, dmf dmf, dkw dkw) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((dio) dmf).b(i, list.get(i2), dkw);
            }
        }
    }

    public static void h(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.b(((Integer) list.get(i4)).intValue());
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.f(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void c(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.a(((Long) list.get(i4)).longValue());
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void a(int i, List list, dmf dmf, dkw dkw) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((dio) dmf).a(i, list.get(i2), dkw);
            }
        }
    }

    public static void l(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += din.g();
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void g(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += din.h();
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void j(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.d(((Integer) list.get(i4)).intValue());
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.g(din.e(((Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.a(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void e(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.b(((Long) list.get(i4)).longValue());
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.d(din.c(((Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void a(int i, List list, dmf dmf) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof dju) {
                dju dju = (dju) list;
                while (i2 < list.size()) {
                    Object c2 = dju.c(i2);
                    if (c2 instanceof String) {
                        ((dio) dmf).a.b(i, (String) c2);
                    } else {
                        ((dio) dmf).a.b(i, (dik) c2);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.b(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    public static void i(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.c(((Integer) list.get(i4)).intValue());
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void d(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.a.f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.a(((Long) list.get(i4)).longValue());
                }
                dio.a.g(i3);
                while (i2 < list.size()) {
                    dio.a.d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).a.e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}
