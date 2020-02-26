package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: buz */
/* compiled from: PG */
public final class buz extends buf {
    public static final Parcelable.Creator CREATOR = new bva();

    /* renamed from: a */
    public File f4888a;

    /* renamed from: b */
    private ParcelFileDescriptor f4889b;

    /* renamed from: c */
    private final String f4890c;

    /* renamed from: d */
    private final String f4891d;

    public buz(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f4889b = parcelFileDescriptor;
        this.f4890c = str;
        this.f4891d = str2;
    }

    /* renamed from: a */
    private static final void m4270a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f4889b == null) {
            File file = this.f4888a;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f4889b = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        byte[] bArr = null;
                        try {
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.writeUTF(this.f4890c);
                            dataOutputStream.writeUTF(this.f4891d);
                            dataOutputStream.write(bArr);
                            m4270a(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m4270a(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException e2) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                } catch (IOException e3) {
                    throw new IllegalStateException("Could not create temporary file:", e3);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
        }
        int a = buj.m4230a(parcel);
        buj.m4238a(parcel, 2, this.f4889b, i);
        buj.m4239a(parcel, 3, this.f4890c);
        buj.m4239a(parcel, 4, this.f4891d);
        buj.m4250b(parcel, a);
    }
}
