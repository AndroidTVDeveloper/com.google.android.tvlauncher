package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: bij  reason: default package */
/* compiled from: PG */
public final class bij extends bho {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public bij() {
        super(false);
    }

    public final Uri a() {
        return this.b;
    }

    public final void c() {
        this.b = null;
        try {
            RandomAccessFile randomAccessFile = this.a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
        } catch (IOException e) {
            throw new bii(e);
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
            throw th;
        }
    }

    public final long a(bhy bhy) {
        Uri uri;
        try {
            uri = bhy.a;
            this.b = uri;
            e();
            RandomAccessFile randomAccessFile = new RandomAccessFile((String) bks.a((Object) uri.getPath()), "r");
            this.a = randomAccessFile;
            randomAccessFile.seek(bhy.e);
            long j = bhy.f;
            if (j == -1) {
                j = this.a.length() - bhy.e;
            }
            this.c = j;
            if (j >= 0) {
                this.d = true;
                b(bhy);
                return this.c;
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

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.c == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) blm.a((Object) this.a)).read(bArr, i, (int) Math.min(this.c, (long) i2));
            if (read > 0) {
                this.c -= (long) read;
                a(read);
            }
            return read;
        } catch (IOException e) {
            throw new bii(e);
        }
    }
}
