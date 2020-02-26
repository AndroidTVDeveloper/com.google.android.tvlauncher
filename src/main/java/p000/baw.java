package p000;

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

/* renamed from: baw */
/* compiled from: PG */
final class baw implements bhv {

    /* renamed from: a */
    private final bhv f3039a;

    /* renamed from: b */
    private final byte[] f3040b;

    /* renamed from: c */
    private final byte[] f3041c;

    /* renamed from: d */
    private CipherInputStream f3042d;

    public baw(bhv bhv, byte[] bArr, byte[] bArr2) {
        this.f3039a = bhv;
        this.f3040b = bArr;
        this.f3041c = bArr2;
    }

    /* renamed from: a */
    public final void mo1501a(bjf bjf) {
        this.f3039a.mo1501a(bjf);
    }

    /* renamed from: c */
    public final void mo1503c() {
        if (this.f3042d != null) {
            this.f3042d = null;
            this.f3039a.mo1503c();
        }
    }

    /* renamed from: b */
    public final Map mo1502b() {
        return this.f3039a.mo1502b();
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f3039a.mo1500a();
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f3040b, "AES"), new IvParameterSpec(this.f3041c));
                bhx bhx = new bhx(this.f3039a, bhy);
                this.f3042d = new CipherInputStream(bhx, instance);
                bhx.mo1950a();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        bks.m3507a(this.f3042d);
        int read = this.f3042d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
