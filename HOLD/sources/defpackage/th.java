package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: th  reason: default package */
/* compiled from: PG */
public final class th {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
        }
    }

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("failed to delete file: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        String valueOf2 = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
        sb2.append("not a readable directory: ");
        sb2.append(valueOf2);
        throw new IOException(sb2.toString());
    }
}
