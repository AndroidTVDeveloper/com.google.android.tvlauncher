package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: die  reason: default package */
/* compiled from: PG */
final class die extends dii {
    public static final long serialVersionUID = 1;
    private final int d;
    private final int e;

    public die(byte[] bArr, int i, int i2) {
        super(bArr);
        a(i, i + i2, bArr.length);
        this.d = i;
        this.e = i2;
    }

    public final int a() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final int b() {
        return this.d;
    }

    public final byte a(int i) {
        int i2 = this.e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.a[this.d + i];
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

    public final byte b(int i) {
        return this.a[this.d + i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        byte[] bArr;
        int i = this.e;
        if (i != 0) {
            bArr = new byte[i];
            System.arraycopy(this.a, this.d, bArr, 0, i);
        } else {
            bArr = djl.b;
        }
        return new dii(bArr);
    }
}
