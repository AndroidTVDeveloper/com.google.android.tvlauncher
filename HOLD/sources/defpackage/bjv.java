package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bjv  reason: default package */
/* compiled from: PG */
final class bjv {
    public final HashMap a;
    public final SparseArray b;
    public final bju c;
    private final SparseBooleanArray d;
    private final SparseBooleanArray e;

    public bjv(File file) {
        boolean z;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        bks.b(z);
        this.a = new HashMap();
        this.b = new SparseArray();
        this.d = new SparseBooleanArray();
        this.e = new SparseBooleanArray();
        this.c = file != null ? new bjt(new File(file, "cached_content_index.exi")) : null;
    }

    public final bjs b(String str) {
        return (bjs) this.a.get(str);
    }

    public final bjs a(String str) {
        bjs bjs = (bjs) this.a.get(str);
        if (bjs != null) {
            return bjs;
        }
        SparseArray sparseArray = this.b;
        int size = sparseArray.size();
        int keyAt = size != 0 ? sparseArray.keyAt(size - 1) + 1 : 0;
        if (keyAt < 0) {
            int i = 0;
            while (keyAt < size && keyAt == sparseArray.keyAt(keyAt)) {
                i = keyAt + 1;
            }
        }
        bjs bjs2 = new bjs(keyAt, str);
        this.a.put(str, bjs2);
        this.b.put(keyAt, str);
        this.e.put(keyAt, true);
        this.c.a();
        return bjs2;
    }

    public final void c(String str) {
        bjs bjs = (bjs) this.a.get(str);
        if (bjs != null && bjs.c.isEmpty() && !bjs.e) {
            this.a.remove(str);
            int i = bjs.a;
            boolean z = this.e.get(i);
            ((bjt) this.c).b = true;
            if (!z) {
                this.b.put(i, null);
                this.d.put(i, true);
                return;
            }
            this.b.remove(i);
            this.e.delete(i);
        }
    }

    public final void a() {
        bke bke;
        bkd bkd;
        bju bju = this.c;
        HashMap hashMap = this.a;
        bjt bjt = (bjt) bju;
        if (bjt.b) {
            DataOutputStream dataOutputStream = null;
            try {
                bke = ((bjt) bju).a;
                if (bke.a.exists()) {
                    if (bke.b.exists()) {
                        bke.a.delete();
                    } else if (!bke.a.renameTo(bke.b)) {
                        String valueOf = String.valueOf(bke.a);
                        String valueOf2 = String.valueOf(bke.b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
                        sb.append("Couldn't rename file ");
                        sb.append(valueOf);
                        sb.append(" to backup file ");
                        sb.append(valueOf2);
                        Log.w("AtomicFile", sb.toString());
                    }
                }
                bkd = new bkd(bke.a);
            } catch (FileNotFoundException e2) {
                String valueOf3 = String.valueOf(bke.a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(valueOf3);
                throw new IOException(sb2.toString(), e2);
            } catch (FileNotFoundException e3) {
                File parentFile = bke.a.getParentFile();
                if (parentFile != null) {
                    if (parentFile.mkdirs()) {
                        bkd = new bkd(bke.a);
                    }
                }
                String valueOf4 = String.valueOf(bke.a);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(valueOf4);
                throw new IOException(sb3.toString(), e3);
            } catch (Throwable th) {
                th = th;
                blm.a((Closeable) dataOutputStream);
                throw th;
            }
            bla bla = ((bjt) bju).c;
            if (bla == null) {
                ((bjt) bju).c = new bla(bkd);
            } else {
                bla.a(bkd);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(((bjt) bju).c);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(hashMap.size());
                int i = 0;
                for (bjs bjs : hashMap.values()) {
                    dataOutputStream2.writeInt(bjs.a);
                    dataOutputStream2.writeUTF(bjs.b);
                    Set<Map.Entry> entrySet = bjs.d.b.entrySet();
                    dataOutputStream2.writeInt(entrySet.size());
                    for (Map.Entry entry : entrySet) {
                        dataOutputStream2.writeUTF((String) entry.getKey());
                        byte[] bArr = (byte[]) entry.getValue();
                        dataOutputStream2.writeInt(bArr.length);
                        dataOutputStream2.write(bArr);
                    }
                    i += bjt.a(bjs, 2);
                }
                dataOutputStream2.writeInt(i);
                bke bke2 = ((bjt) bju).a;
                dataOutputStream2.close();
                bke2.b.delete();
                blm.a((Closeable) null);
                bjt.b = false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                blm.a((Closeable) dataOutputStream);
                throw th;
            }
        }
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.b.remove(this.d.keyAt(i2));
        }
        this.d.clear();
        this.e.clear();
    }
}
