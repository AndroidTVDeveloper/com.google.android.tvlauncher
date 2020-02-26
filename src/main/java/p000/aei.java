package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: aei */
/* compiled from: PG */
public final class aei implements C0543ua {
    /* renamed from: a */
    public final int mo40a() {
        return 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo29a(Object obj, File file, C0539tx txVar) {
        try {
            ahr.m524a(((aeh) ((C0619ww) obj).mo33b()).mo99b(), file);
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
