package p000;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dbk */
/* compiled from: PG */
public final class dbk {
    /* renamed from: a */
    public static Set m6089a(ContentResolver contentResolver, String str) {
        String a = byi.m4368a(contentResolver, str, "");
        if (!a.isEmpty()) {
            return new HashSet(Arrays.asList(a.replaceAll("\\s", "").split(",")));
        }
        return Collections.emptySet();
    }

    /* renamed from: a */
    public static Intent m6088a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.addFlags(270532608);
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        }
        return intent;
    }
}
