package defpackage;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: azp  reason: default package */
/* compiled from: PG */
final class azp implements biz {
    private azp() {
    }

    public /* synthetic */ azp(byte b) {
    }

    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        return Long.valueOf(blm.f(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
