package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cxm  reason: default package */
/* compiled from: PG */
public final class cxm {
    private static final Pattern a = Pattern.compile("[a-zA-Z0-9_-]+");
    private static final Pattern b = Pattern.compile("^(www[.])?youtube.com$");
    private static final Pattern c = Pattern.compile("^(www[.])?youtu.be$");
    private static final Pattern d = Pattern.compile("^/watch$");
    private static final Pattern e;
    private static final Pattern f;
    private static final List g = Arrays.asList("http", "https");

    static {
        String valueOf = String.valueOf(a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("^/video/(");
        sb.append(valueOf);
        sb.append(")$");
        e = Pattern.compile(sb.toString());
        String valueOf2 = String.valueOf(a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 5);
        sb2.append("^/(");
        sb2.append(valueOf2);
        sb2.append(")$");
        f = Pattern.compile(sb2.toString());
    }

    public static String a(Uri uri) {
        if (g.contains(uri.getScheme()) && uri.getAuthority() != null) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                if (b.matcher(uri.getAuthority()).matches()) {
                    if (d.matcher(path).matches()) {
                        return uri.getQueryParameter("v");
                    }
                    Matcher matcher = e.matcher(path);
                    if (!matcher.matches() || matcher.groupCount() != 1) {
                        return null;
                    }
                    return matcher.group(1);
                } else if (c.matcher(uri.getAuthority()).matches()) {
                    Matcher matcher2 = f.matcher(path);
                    if (matcher2.matches() && matcher2.groupCount() == 1) {
                        return matcher2.group(1);
                    }
                }
            }
        }
        return null;
    }
}
