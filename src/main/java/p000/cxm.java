package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cxm */
/* compiled from: PG */
public final class cxm {

    /* renamed from: a */
    private static final Pattern f7844a = Pattern.compile("[a-zA-Z0-9_-]+");

    /* renamed from: b */
    private static final Pattern f7845b = Pattern.compile("^(www[.])?youtube.com$");

    /* renamed from: c */
    private static final Pattern f7846c = Pattern.compile("^(www[.])?youtu.be$");

    /* renamed from: d */
    private static final Pattern f7847d = Pattern.compile("^/watch$");

    /* renamed from: e */
    private static final Pattern f7848e;

    /* renamed from: f */
    private static final Pattern f7849f;

    /* renamed from: g */
    private static final List f7850g = Arrays.asList("http", "https");

    static {
        String valueOf = String.valueOf(f7844a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("^/video/(");
        sb.append(valueOf);
        sb.append(")$");
        f7848e = Pattern.compile(sb.toString());
        String valueOf2 = String.valueOf(f7844a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 5);
        sb2.append("^/(");
        sb2.append(valueOf2);
        sb2.append(")$");
        f7849f = Pattern.compile(sb2.toString());
    }

    /* renamed from: a */
    public static String m5905a(Uri uri) {
        if (f7850g.contains(uri.getScheme()) && uri.getAuthority() != null) {
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                if (f7845b.matcher(uri.getAuthority()).matches()) {
                    if (f7847d.matcher(path).matches()) {
                        return uri.getQueryParameter("v");
                    }
                    Matcher matcher = f7848e.matcher(path);
                    if (!matcher.matches() || matcher.groupCount() != 1) {
                        return null;
                    }
                    return matcher.group(1);
                } else if (f7846c.matcher(uri.getAuthority()).matches()) {
                    Matcher matcher2 = f7849f.matcher(path);
                    if (matcher2.matches() && matcher2.groupCount() == 1) {
                        return matcher2.group(1);
                    }
                }
            }
        }
        return null;
    }
}
