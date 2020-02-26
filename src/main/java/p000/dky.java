package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: dky */
/* compiled from: PG */
final class dky {

    /* renamed from: a */
    public static final dlw f8743a = m6896a(false);

    /* renamed from: b */
    public static final dlw f8744b = m6896a(true);

    /* renamed from: c */
    public static final dlw f8745c = new dlw((byte) 0);

    /* renamed from: d */
    private static final Class f8746d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        f8746d = cls;
    }

    /* renamed from: c */
    static int m6912c(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * din.m6565i(i);
        }
        return 0;
    }

    /* renamed from: j */
    static int m6935j(List list) {
        return list.size();
    }

    /* renamed from: b */
    static int m6905b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a = size * din.m6528a(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            a += din.m6534a((dik) list.get(i2));
        }
        return a;
    }

    /* renamed from: d */
    static int m6916d(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m6917d(list) + (size * din.m6528a(i));
        }
        return 0;
    }

    /* renamed from: d */
    static int m6917d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djf) {
            djf djf = (djf) list;
            int i2 = 0;
            while (i < size) {
                i2 += din.m6542b(djf.mo4522c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += din.m6542b(((Integer) list.get(i)).intValue());
            i++;
        }
        return i3;
    }

    /* renamed from: e */
    static int m6919e(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * din.m6567k(i);
        }
        return 0;
    }

    /* renamed from: h */
    static int m6929h(List list) {
        return list.size() << 2;
    }

    /* renamed from: f */
    static int m6922f(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return size * din.m6568l(i);
        }
        return 0;
    }

    /* renamed from: i */
    static int m6932i(List list) {
        return list.size() << 3;
    }

    /* renamed from: b */
    static int m6906b(int i, List list, dkw dkw) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += din.m6531a(i, (dkk) list.get(i3), dkw);
        }
        return i2;
    }

    /* renamed from: g */
    static int m6925g(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m6920e(list) + (size * din.m6528a(i));
        }
        return 0;
    }

    /* renamed from: e */
    static int m6920e(List list) {
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
                i += din.m6542b(djf.mo4522c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.m6542b(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: h */
    static int m6928h(int i, List list) {
        if (list.size() != 0) {
            return m6895a(list) + (list.size() * din.m6528a(i));
        }
        return 0;
    }

    /* renamed from: a */
    static int m6895a(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof djy) {
            djy djy = (djy) list;
            int i2 = 0;
            while (i < size) {
                i2 += din.m6533a(djy.mo4549c(i));
                i++;
            }
            return i2;
        }
        int i3 = 0;
        while (i < size) {
            i3 += din.m6533a(((Long) list.get(i)).longValue());
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    static int m6892a(int i, Object obj, dkw dkw) {
        if (obj instanceof djs) {
            return din.m6530a(i, (djs) obj);
        }
        return din.m6528a(i) + din.m6537a((dkk) obj, dkw);
    }

    /* renamed from: a */
    static int m6894a(int i, List list, dkw dkw) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int a = din.m6528a(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof djs) {
                i2 = din.m6535a((djs) obj);
            } else {
                i2 = din.m6537a((dkk) obj, dkw);
            }
            a += i2;
        }
        return a;
    }

    /* renamed from: i */
    static int m6931i(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m6926g(list) + (size * din.m6528a(i));
        }
        return 0;
    }

    /* renamed from: g */
    static int m6926g(List list) {
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
                i += din.m6555d(djf.mo4522c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.m6555d(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: j */
    static int m6934j(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m6913c(list) + (size * din.m6528a(i));
        }
        return 0;
    }

    /* renamed from: c */
    static int m6913c(List list) {
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
                i += din.m6545b(djy.mo4549c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.m6545b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static int m6893a(int i, List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int a = din.m6528a(i) * size;
        if (!(list instanceof dju)) {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof dik) {
                    i2 = din.m6534a((dik) obj);
                } else {
                    i2 = din.m6538a((String) obj);
                }
                a += i2;
                i3++;
            }
        } else {
            dju dju = (dju) list;
            while (i3 < size) {
                Object c = dju.mo4542c(i3);
                a += c instanceof dik ? din.m6534a((dik) c) : din.m6538a((String) c);
                i3++;
            }
        }
        return a;
    }

    /* renamed from: k */
    static int m6937k(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m6923f(list) + (size * din.m6528a(i));
        }
        return 0;
    }

    /* renamed from: f */
    static int m6923f(List list) {
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
                i += din.m6550c(djf.mo4522c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.m6550c(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: l */
    static int m6939l(int i, List list) {
        int size = list.size();
        if (size != 0) {
            return m6907b(list) + (size * din.m6528a(i));
        }
        return 0;
    }

    /* renamed from: b */
    static int m6907b(List list) {
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
                i += din.m6533a(djy.mo4549c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + din.m6533a(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    static Object m6898a(int i, List list, djh djh, Object obj) {
        if (djh == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!djh.mo4289a(intValue)) {
                    obj = m6897a(i, intValue, obj);
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
            if (!djh.mo4289a(intValue2)) {
                obj2 = m6897a(i, intValue2, obj2);
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

    /* renamed from: a */
    private static dlw m6896a(boolean z) {
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

    /* renamed from: b */
    static void m6911b(Object obj, Object obj2) {
        div a = dkc.m6772a(obj2);
        if (!a.mo4477a()) {
            div a2 = ((djc) obj).mo4510a();
            for (int i = 0; i < a.f8607a.mo4612b(); i++) {
                a2.mo4476a(a.f8607a.mo4613b(i));
            }
            for (Map.Entry a3 : a.f8607a.mo4614c()) {
                a2.mo4476a(a3);
            }
        }
    }

    /* renamed from: a */
    static void m6902a(dke dke, Object obj, Object obj2, long j) {
        dlv.m7033a(obj, j, dke.mo4564a(dlv.m7045f(obj, j), dlv.m7045f(obj2, j)));
    }

    /* renamed from: c */
    static void m6915c(Object obj, Object obj2) {
        dlm a = dlw.m7050a(obj);
        dlm a2 = dlw.m7050a(obj2);
        if (!a2.equals(dlm.f8766a)) {
            a = dlm.m6973a(a, a2);
        }
        dlw.m7055a(obj, a);
    }

    /* renamed from: a */
    public static void m6903a(Class cls) {
        Class cls2;
        if (!dje.class.isAssignableFrom(cls) && (cls2 = f8746d) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    static boolean m6904a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: a */
    private static Object m6897a(int i, int i2, Object obj) {
        if (obj == null) {
            obj = dlm.m6972a();
        }
        ((dlm) obj).mo4627a(dme.m7093a(i, 0), Long.valueOf((long) i2));
        return obj;
    }

    /* renamed from: n */
    public static void m6942n(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3 += din.m6541b();
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4424a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4429a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m6908b(int i, List list, dmf dmf) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((dio) dmf).f8594a.mo4431b(i, (dik) list.get(i2));
            }
        }
    }

    /* renamed from: a */
    public static void m6901a(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += din.m6549c();
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4435e(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4425a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m6941m(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.m6542b(((Integer) list.get(i4)).intValue());
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4436f(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4440g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m6938k(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += din.m6554d();
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4441h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4443i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m6924f(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += din.m6558e();
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4435e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4438f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m6910b(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += din.m6561f();
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4441h(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4426a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m6909b(int i, List list, dmf dmf, dkw dkw) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((dio) dmf).mo4454b(i, list.get(i2), dkw);
            }
        }
    }

    /* renamed from: h */
    public static void m6930h(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.m6542b(((Integer) list.get(i4)).intValue());
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4436f(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4440g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m6914c(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.m6533a(((Long) list.get(i4)).longValue());
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4433d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4434e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m6900a(int i, List list, dmf dmf, dkw dkw) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((dio) dmf).mo4450a(i, list.get(i2), dkw);
            }
        }
    }

    /* renamed from: l */
    public static void m6940l(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += din.m6562g();
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4441h(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4443i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: g */
    public static void m6927g(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += din.m6563h();
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4435e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4438f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m6936j(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.m6555d(((Integer) list.get(i4)).intValue());
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4439g(din.m6559e(((Integer) list.get(i2)).intValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4427a(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m6921e(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.m6545b(((Long) list.get(i4)).longValue());
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4433d(din.m6553c(((Long) list.get(i2)).longValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4428a(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m6899a(int i, List list, dmf dmf) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (list instanceof dju) {
                dju dju = (dju) list;
                while (i2 < list.size()) {
                    Object c = dju.mo4542c(i2);
                    if (c instanceof String) {
                        ((dio) dmf).f8594a.mo4432b(i, (String) c);
                    } else {
                        ((dio) dmf).f8594a.mo4431b(i, (dik) c);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4432b(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: i */
    public static void m6933i(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.m6550c(((Integer) list.get(i4)).intValue());
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4439g(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4442h(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m6918d(int i, List list, dmf dmf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                dio dio = (dio) dmf;
                dio.f8594a.mo4437f(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += din.m6533a(((Long) list.get(i4)).longValue());
                }
                dio.f8594a.mo4439g(i3);
                while (i2 < list.size()) {
                    dio.f8594a.mo4433d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((dio) dmf).f8594a.mo4434e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}
