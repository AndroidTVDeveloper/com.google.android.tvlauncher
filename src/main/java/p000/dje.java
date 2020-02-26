package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dje */
/* compiled from: PG */
public abstract class dje extends dhu {

    /* renamed from: B */
    public static final Map f8676B = new ConcurrentHashMap();

    /* renamed from: A */
    public dlm f8677A = dlm.f8766a;

    /* renamed from: a */
    private int f8678a = -1;

    /* renamed from: n */
    public static djj m6694n() {
        return djy.f8703b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo3114a(int i, Object obj);

    /* renamed from: k */
    public final int mo4372k() {
        return this.f8678a;
    }

    /* renamed from: a */
    private static dje m6685a(dje dje) {
        if (dje == null || dje.mo4502V()) {
            return dje;
        }
        throw new djn(new dll().getMessage());
    }

    /* renamed from: l */
    public final dja mo4516l() {
        return (dja) mo4513b(5);
    }

    /* renamed from: b */
    public final Object mo4513b(int i) {
        return mo3114a(i, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((dje) mo4513b(6)).getClass().isInstance(obj)) {
            return dkt.f8733a.mo4587a(this).mo4579a(this, (dje) obj);
        }
        return false;
    }

    /* renamed from: W */
    public final /* bridge */ /* synthetic */ dkk mo4503W() {
        return (dje) mo4513b(6);
    }

    /* renamed from: m */
    public final int mo4517m() {
        int i = this.f8678a;
        if (i != -1) {
            return i;
        }
        int b = dkt.f8733a.mo4587a(this).mo4580b(this);
        this.f8678a = b;
        return b;
    }

    public final int hashCode() {
        int i = this.f8563z;
        if (i != 0) {
            return i;
        }
        int a = dkt.f8733a.mo4587a(this).mo4574a(this);
        this.f8563z = a;
        return a;
    }

    /* renamed from: a */
    static Object m6692a(Method method, Object obj, Object... objArr) {
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

    /* renamed from: V */
    public final boolean mo4502V() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo4513b(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = dkt.f8733a.mo4587a(this).mo4583d(this);
        if (!booleanValue) {
            return d;
        }
        mo3114a(2, !d ? null : this);
        return d;
    }

    /* renamed from: a */
    public static djj m6689a(djj djj) {
        int i;
        int size = djj.size();
        if (size != 0) {
            i = size + size;
        } else {
            i = 10;
        }
        return djj.mo4529b(i);
    }

    /* renamed from: a */
    public static djk m6690a(djk djk) {
        int i;
        int size = djk.size();
        if (size != 0) {
            i = size + size;
        } else {
            i = 10;
        }
        return djk.mo4398a(i);
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ dkj mo4519p() {
        return (dja) mo4513b(5);
    }

    /* renamed from: a */
    protected static Object m6691a(dkk dkk, String str, Object[] objArr) {
        return new dkv(dkk, str, objArr);
    }

    /* renamed from: a */
    public static dje m6686a(dje dje, byte[] bArr) {
        return m6685a(m6687a(dje, bArr, bArr.length, dis.m6616a()));
    }

    /* renamed from: a */
    public static dje m6688a(dje dje, byte[] bArr, dis dis) {
        return m6685a(m6687a(dje, bArr, bArr.length, dis));
    }

    /* renamed from: a */
    private static dje m6687a(dje dje, byte[] bArr, int i, dis dis) {
        dje dje2 = (dje) dje.mo4513b(4);
        try {
            dkw a = dkt.f8733a.mo4587a(dje2);
            a.mo4578a(dje2, bArr, 0, i, new dhy(dis));
            a.mo4582c(dje2);
            if (dje2.f8563z == 0) {
                return dje2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof djn) {
                throw ((djn) e.getCause());
            }
            throw new djn(e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            throw djn.m6731a();
        }
    }

    /* renamed from: a */
    protected static void m6693a(Class cls, dje dje) {
        f8676B.put(cls, dje);
    }

    /* renamed from: a */
    public final void mo4369a(int i) {
        this.f8678a = i;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ dkj mo4518o() {
        dja dja = (dja) mo4513b(5);
        dja.mo4366a(this);
        return dja;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        dlk.m6967a(this, sb, 0);
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkw.a(java.lang.Object, dmf):void
     arg types: [dje, dio]
     candidates:
      dkw.a(java.lang.Object, java.lang.Object):boolean
      dkw.a(java.lang.Object, dmf):void */
    /* renamed from: a */
    public final void mo4512a(din din) {
        dkw a = dkt.f8733a.mo4587a(this);
        dio dio = din.f8590a;
        if (dio == null) {
            dio = new dio(din);
        }
        a.mo4577a((Object) this, (dmf) dio);
    }
}
