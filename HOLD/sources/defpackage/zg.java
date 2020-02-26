package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: zg  reason: default package */
/* compiled from: PG */
public final class zg implements tp {
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, tx txVar) {
        try {
            ahr.a((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
