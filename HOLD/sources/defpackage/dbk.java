package defpackage;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: dbk  reason: default package */
/* compiled from: PG */
public final class dbk {
    public static Set a(ContentResolver contentResolver, String str) {
        String a = byi.a(contentResolver, str, "");
        if (!a.isEmpty()) {
            return new HashSet(Arrays.asList(a.replaceAll("\\s", "").split(",")));
        }
        return Collections.emptySet();
    }

    public static Intent a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        intent.addFlags(270532608);
        if (str2 != null) {
            intent.setData(Uri.parse(str2));
        }
        return intent;
    }
}
