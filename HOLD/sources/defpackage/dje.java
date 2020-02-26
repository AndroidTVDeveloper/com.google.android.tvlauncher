package defpackage;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dje  reason: default package */
/* compiled from: PG */
public abstract class dje extends dhu {
    public static final Map B = new ConcurrentHashMap();
    public dlm A = dlm.a;
    private int a = -1;

    public static djj n() {
        return djy.b;
    }

    /* access modifiers changed from: protected */
    public abstract Object a(int i, Object obj);

    public final int k() {
        return this.a;
    }

    private static dje a(dje dje) {
        if (dje == null || dje.V()) {
            return dje;
        }
        throw new djn(new dll().getMessage());
    }

    public final dja l() {
        return (dja) b(5);
    }

    public final Object b(int i) {
        return a(i, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((dje) b(6)).getClass().isInstance(obj)) {
            return dkt.a.a(this).a(this, (dje) obj);
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ dkk W() {
        return (dje) b(6);
    }

    public final int m() {
        int i = this.a;
        if (i != -1) {
            return i;
        }
        int b = dkt.a.a(this).b(this);
        this.a = b;
        return b;
    }

    public final int hashCode() {
        int i = this.z;
        if (i != 0) {
            return i;
        }
        int a2 = dkt.a.a(this).a(this);
        this.z = a2;
        return a2;
    }

    static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public final boolean V() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) b(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = dkt.a.a(this).d(this);
        if (!booleanValue) {
            return d;
        }
        a(2, !d ? null : this);
        return d;
    }

    public static djj a(djj djj) {
        int i;
        int size = djj.size();
        if (size != 0) {
            i = size + size;
        } else {
            i = 10;
        }
        return djj.b(i);
    }

    public static djk a(djk djk) {
        int i;
        int size = djk.size();
        if (size != 0) {
            i = size + size;
        } else {
            i = 10;
        }
        return djk.a(i);
    }

    public final /* bridge */ /* synthetic */ dkj p() {
        return (dja) b(5);
    }

    protected static Object a(dkk dkk, String str, Object[] objArr) {
        return new dkv(dkk, str, objArr);
    }

    public static dje a(dje dje, byte[] bArr) {
        return a(a(dje, bArr, bArr.length, dis.a()));
    }

    public static dje a(dje dje, byte[] bArr, dis dis) {
        return a(a(dje, bArr, bArr.length, dis));
    }

    private static dje a(dje dje, byte[] bArr, int i, dis dis) {
        dje dje2 = (dje) dje.b(4);
        try {
            dkw a2 = dkt.a.a(dje2);
            a2.a(dje2, bArr, 0, i, new dhy(dis));
            a2.c(dje2);
            if (dje2.z == 0) {
                return dje2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof djn) {
                throw ((djn) e.getCause());
            }
            throw new djn(e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            throw djn.a();
        }
    }

    protected static void a(Class cls, dje dje) {
        B.put(cls, dje);
    }

    public final void a(int i) {
        this.a = i;
    }

    public final /* bridge */ /* synthetic */ dkj o() {
        dja dja = (dja) b(5);
        dja.a(this);
        return dja;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        dlk.a(this, sb, 0);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkw.a(java.lang.Object, dmf):void
     arg types: [dje, dio]
     candidates:
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void */
    public final void a(din din) {
        dkw a2 = dkt.a.a(this);
        dio dio = din.a;
        if (dio == null) {
            dio = new dio(din);
        }
        a2.a((Object) this, (dmf) dio);
    }
}
