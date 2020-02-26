package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: bij */
/* compiled from: PG */
public final class bij extends bho {

    /* renamed from: a */
    private RandomAccessFile f4069a;

    /* renamed from: b */
    private Uri f4070b;

    /* renamed from: c */
    private long f4071c;

    /* renamed from: d */
    private boolean f4072d;

    public bij() {
        super(false);
    }

    /* renamed from: a */
    public final Uri mo1500a() {
        return this.f4070b;
    }

    /* renamed from: c */
    public final void mo1503c() {
        this.f4070b = null;
        try {
            RandomAccessFile randomAccessFile = this.f4069a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f4069a = null;
            if (this.f4072d) {
                this.f4072d = false;
                mo1944d();
            }
        } catch (IOException e) {
            throw new bii(e);
        } catch (Throwable th) {
            this.f4069a = null;
            if (this.f4072d) {
                this.f4072d = false;
                mo1944d();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final long mo1499a(bhy bhy) {
        Uri uri;
        try {
            uri = bhy.f3998a;
            this.f4070b = uri;
            mo1945e();
            RandomAccessFile randomAccessFile = new RandomAccessFile((String) bks.m3507a((Object) uri.getPath()), "r");
            this.f4069a = randomAccessFile;
            randomAccessFile.seek(bhy.f4002e);
            long j = bhy.f4003f;
            if (j == -1) {
                j = this.f4069a.length() - bhy.f4002e;
            }
            this.f4071c = j;
            if (j >= 0) {
                this.f4072d = true;
                mo1943b(bhy);
                return this.f4071c;
            }
            throw new EOFException();
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getFragment())) {
                    throw new bii(e);
                }
            }
            throw new bii(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
        } catch (IOException e2) {
            throw new bii(e2);
        }
    }

    /* renamed from: a */
    public final int mo1498a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f4071c == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) blm.m3636a((Object) this.f4069a)).read(bArr, i, (int) Math.min(this.f4071c, (long) i2));
            if (read > 0) {
                this.f4071c -= (long) read;
                mo1942a(read);
            }
            return read;
        } catch (IOException e) {
            throw new bii(e);
        }
    }
}
