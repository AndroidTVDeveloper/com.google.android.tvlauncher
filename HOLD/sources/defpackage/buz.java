package defpackage;

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

/* renamed from: buz  reason: default package */
/* compiled from: PG */
public final class buz extends buf {
    public static final Parcelable.Creator CREATOR = new bva();
    public File a;
    private ParcelFileDescriptor b;
    private final String c;
    private final String d;

    public buz(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.b = parcelFileDescriptor;
        this.c = str;
        this.d = str2;
    }

    private static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            File file = this.a;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.b = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        byte[] bArr = null;
                        try {
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.writeUTF(this.d);
                            dataOutputStream.write(bArr);
                            a(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            a(dataOutputStream);
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
        int a2 = buj.a(parcel);
        buj.a(parcel, 2, this.b, i);
        buj.a(parcel, 3, this.c);
        buj.a(parcel, 4, this.d);
        buj.b(parcel, a2);
    }
}
