package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: die */
/* compiled from: PG */
final class die extends dii {
    public static final long serialVersionUID = 1;

    /* renamed from: d */
    private final int f8577d;

    /* renamed from: e */
    private final int f8578e;

    public die(byte[] bArr, int i, int i2) {
        super(bArr);
        m6512a(i, i + i2, bArr.length);
        this.f8577d = i;
        this.f8578e = i2;
    }

    /* renamed from: a */
    public final int mo4408a() {
        return this.f8578e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo4410b() {
        return this.f8577d;
    }

    /* renamed from: a */
    public final byte mo4407a(int i) {
        int i2 = this.f8578e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f8581a[this.f8577d + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: b */
    public final byte mo4409b(int i) {
        return this.f8581a[this.f8577d + i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        byte[] bArr;
        int i = this.f8578e;
        if (i != 0) {
            bArr = new byte[i];
            System.arraycopy(this.f8581a, this.f8577d, bArr, 0, i);
        } else {
            bArr = djl.f8683b;
        }
        return new dii(bArr);
    }
}
