package defpackage;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: baw  reason: default package */
/* compiled from: PG */
final class baw implements bhv {
    private final bhv a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public baw(bhv bhv, byte[] bArr, byte[] bArr2) {
        this.a = bhv;
        this.b = bArr;
        this.c = bArr2;
    }

    public final void a(bjf bjf) {
        this.a.a(bjf);
    }

    public final void c() {
        if (this.d != null) {
            this.d = null;
            this.a.c();
        }
    }

    public final Map b() {
        return this.a.b();
    }

    public final Uri a() {
        return this.a.a();
    }

    public final long a(bhy bhy) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                bhx bhx = new bhx(this.a, bhy);
                this.d = new CipherInputStream(bhx, instance);
                bhx.a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        bks.a(this.d);
        int read = this.d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
