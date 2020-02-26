package p000;

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

/* renamed from: bjv */
/* compiled from: PG */
final class bjv {

    /* renamed from: a */
    public final HashMap f4174a;

    /* renamed from: b */
    public final SparseArray f4175b;

    /* renamed from: c */
    public final bju f4176c;

    /* renamed from: d */
    private final SparseBooleanArray f4177d;

    /* renamed from: e */
    private final SparseBooleanArray f4178e;

    public bjv(File file) {
        boolean z;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        bks.m3512b(z);
        this.f4174a = new HashMap();
        this.f4175b = new SparseArray();
        this.f4177d = new SparseBooleanArray();
        this.f4178e = new SparseBooleanArray();
        this.f4176c = file != null ? new bjt(new File(file, "cached_content_index.exi")) : null;
    }

    /* renamed from: b */
    public final bjs mo2014b(String str) {
        return (bjs) this.f4174a.get(str);
    }

    /* renamed from: a */
    public final bjs mo2012a(String str) {
        bjs bjs = (bjs) this.f4174a.get(str);
        if (bjs != null) {
            return bjs;
        }
        SparseArray sparseArray = this.f4175b;
        int size = sparseArray.size();
        int keyAt = size != 0 ? sparseArray.keyAt(size - 1) + 1 : 0;
        if (keyAt < 0) {
            int i = 0;
            while (keyAt < size && keyAt == sparseArray.keyAt(keyAt)) {
                i = keyAt + 1;
            }
        }
        bjs bjs2 = new bjs(keyAt, str);
        this.f4174a.put(str, bjs2);
        this.f4175b.put(keyAt, str);
        this.f4178e.put(keyAt, true);
        this.f4176c.mo2011a();
        return bjs2;
    }

    /* renamed from: c */
    public final void mo2015c(String str) {
        bjs bjs = (bjs) this.f4174a.get(str);
        if (bjs != null && bjs.f4168c.isEmpty() && !bjs.f4170e) {
            this.f4174a.remove(str);
            int i = bjs.f4166a;
            boolean z = this.f4178e.get(i);
            ((bjt) this.f4176c).f4172b = true;
            if (!z) {
                this.f4175b.put(i, null);
                this.f4177d.put(i, true);
                return;
            }
            this.f4175b.remove(i);
            this.f4178e.delete(i);
        }
    }

    /* renamed from: a */
    public final void mo2013a() {
        bke bke;
        bkd bkd;
        bju bju = this.f4176c;
        HashMap hashMap = this.f4174a;
        bjt bjt = (bjt) bju;
        if (bjt.f4172b) {
            DataOutputStream dataOutputStream = null;
            try {
                bke = ((bjt) bju).f4171a;
                if (bke.f4204a.exists()) {
                    if (bke.f4205b.exists()) {
                        bke.f4204a.delete();
                    } else if (!bke.f4204a.renameTo(bke.f4205b)) {
                        String valueOf = String.valueOf(bke.f4204a);
                        String valueOf2 = String.valueOf(bke.f4205b);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37 + String.valueOf(valueOf2).length());
                        sb.append("Couldn't rename file ");
                        sb.append(valueOf);
                        sb.append(" to backup file ");
                        sb.append(valueOf2);
                        Log.w("AtomicFile", sb.toString());
                    }
                }
                bkd = new bkd(bke.f4204a);
            } catch (FileNotFoundException e) {
                String valueOf3 = String.valueOf(bke.f4204a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(valueOf3);
                throw new IOException(sb2.toString(), e);
            } catch (FileNotFoundException e2) {
                File parentFile = bke.f4204a.getParentFile();
                if (parentFile != null) {
                    if (parentFile.mkdirs()) {
                        bkd = new bkd(bke.f4204a);
                    }
                }
                String valueOf4 = String.valueOf(bke.f4204a);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(valueOf4);
                throw new IOException(sb3.toString(), e2);
            } catch (Throwable th) {
                th = th;
                blm.m3645a((Closeable) dataOutputStream);
                throw th;
            }
            bla bla = ((bjt) bju).f4173c;
            if (bla == null) {
                ((bjt) bju).f4173c = new bla(bkd);
            } else {
                bla.mo2103a(bkd);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(((bjt) bju).f4173c);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(hashMap.size());
                int i = 0;
                for (bjs bjs : hashMap.values()) {
                    dataOutputStream2.writeInt(bjs.f4166a);
                    dataOutputStream2.writeUTF(bjs.f4167b);
                    Set<Map.Entry> entrySet = bjs.f4169d.f4182b.entrySet();
                    dataOutputStream2.writeInt(entrySet.size());
                    for (Map.Entry entry : entrySet) {
                        dataOutputStream2.writeUTF((String) entry.getKey());
                        byte[] bArr = (byte[]) entry.getValue();
                        dataOutputStream2.writeInt(bArr.length);
                        dataOutputStream2.write(bArr);
                    }
                    i += bjt.m3439a(bjs, 2);
                }
                dataOutputStream2.writeInt(i);
                bke bke2 = ((bjt) bju).f4171a;
                dataOutputStream2.close();
                bke2.f4205b.delete();
                blm.m3645a((Closeable) null);
                bjt.f4172b = false;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                blm.m3645a((Closeable) dataOutputStream);
                throw th;
            }
        }
        int size = this.f4177d.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4175b.remove(this.f4177d.keyAt(i2));
        }
        this.f4177d.clear();
        this.f4178e.clear();
    }
}
