package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: azk  reason: default package */
/* compiled from: PG */
final class azk implements biz {
    private static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    private static final Long a(InputStream inputStream) {
        long j;
        long j2;
        String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
        try {
            Matcher matcher = a.matcher(readLine);
            if (!matcher.matches()) {
                String valueOf = String.valueOf(readLine);
                throw new ako(valueOf.length() == 0 ? new String("Couldn't parse timestamp: ") : "Couldn't parse timestamp: ".concat(valueOf));
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                if (!"+".equals(matcher.group(4))) {
                    j = -1;
                } else {
                    j = 1;
                }
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                if (!TextUtils.isEmpty(group2)) {
                    j2 = Long.parseLong(group2);
                } else {
                    j2 = 0;
                }
                time -= j * (((parseLong * 60) + j2) * 60000);
            }
            return Long.valueOf(time);
        } catch (ParseException e) {
            throw new ako(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object a(Uri uri, InputStream inputStream) {
        return a(inputStream);
    }
}
