package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: aei  reason: default package */
/* compiled from: PG */
public final class aei implements ua {
    public final int a() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, tx txVar) {
        try {
            ahr.a(((aeh) ((ww) obj).b()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }
}
