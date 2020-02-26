package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.media.tv.TvContract;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.widget.BarRatingView;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: cok  reason: default package */
/* compiled from: PG */
final class cok {
    private static final SimpleDateFormat I = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat J;
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public boolean F = false;
    public String G;
    public coj H;
    private final ImageView K;
    private final ImageView L;
    private final DateFormat M;
    private final cjq N;
    private final String O;
    private final String P;
    public final Context a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final int e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final BarRatingView i;
    public boolean j;
    public final Pattern k;
    public final View l;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final ImageView p;
    public final MeasureFormat q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final Drawable v;
    public final int w;
    public final int x;
    public final int y;
    public final String z;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public cok(View view) {
        this.a = view.getContext();
        this.b = (TextView) view.findViewById(R.id.first);
        this.c = (TextView) view.findViewById(R.id.second);
        TextView textView = (TextView) view.findViewById(R.id.third);
        this.d = textView;
        this.e = textView.getMaxLines();
        this.f = (TextView) view.findViewById(R.id.thumbCountUp);
        this.g = (TextView) view.findViewById(R.id.thumbCountDown);
        this.K = (ImageView) view.findViewById(R.id.thumbUp);
        this.L = (ImageView) view.findViewById(R.id.thumbDown);
        this.h = (TextView) view.findViewById(R.id.rating_percentage);
        this.i = (BarRatingView) view.findViewById(R.id.star_rating);
        this.l = view.findViewById(R.id.price_container);
        this.m = (TextView) view.findViewById(R.id.old_price);
        this.n = (TextView) view.findViewById(R.id.price);
        this.o = (TextView) view.findViewById(R.id.content_rating);
        this.p = (ImageView) view.findViewById(R.id.program_logo);
        TextView textView2 = this.m;
        textView2.setPaintFlags(textView2.getPaintFlags() | 16);
        this.O = this.a.getString(R.string.program_metadata_item_separator);
        this.P = this.a.getString(R.string.program_metadata_prefix);
        this.r = this.a.getString(R.string.program_metadata_suffix);
        this.s = this.a.getString(R.string.program_availability_free_with_subscription);
        this.t = this.a.getString(R.string.program_availability_purchased);
        this.v = view.getContext().getDrawable(R.drawable.ic_program_meta_purchased_black);
        this.u = this.a.getString(R.string.program_availability_free);
        this.w = this.a.getColor(R.color.program_meta_availability_default_color);
        this.x = this.a.getColor(R.color.program_meta_availability_purchased_color);
        this.y = this.a.getColor(R.color.program_meta_availability_free_color);
        this.z = this.a.getString(R.string.program_season_display_number);
        this.A = this.a.getString(R.string.program_episode_display_number);
        this.B = this.a.getString(R.string.program_chapter_display_number);
        this.C = this.a.getString(R.string.program_episode_title);
        this.D = this.a.getString(R.string.program_episode_title_and_short_description);
        this.E = this.a.getString(R.string.program_interaction_release_date_and_short_description);
        this.M = android.text.format.DateFormat.getLongDateFormat(this.a);
        this.q = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.NARROW);
        this.N = new cjq(this.a);
        this.k = Pattern.compile("^(\\d+),(\\d+)$");
    }

    public final void a(StringBuilder sb, cxu cxu) {
        String[] decode;
        int length;
        String M2 = cxu.M();
        String str = null;
        if (TextUtils.isEmpty(M2)) {
            cjq cjq = this.N;
            String w2 = cxu.w();
            if (!TextUtils.isEmpty(w2) && (length = (decode = TvContract.Programs.Genres.decode(w2)).length) != 0) {
                List arrayList = new ArrayList(length);
                for (int i2 = 0; i2 < length; i2++) {
                    int indexOf = cjq.a.indexOf(decode[i2]);
                    if (indexOf != -1) {
                        arrayList.add(cjq.b[indexOf]);
                    }
                }
                if (arrayList.size() != 0) {
                    int size = arrayList.size();
                    int length2 = cjq.c.length;
                    if (size > length2) {
                        arrayList = arrayList.subList(0, length2);
                    }
                    M2 = String.format(cjq.c[arrayList.size() - 1], arrayList.toArray());
                }
            }
            a(sb, str);
            this.H.f = str;
        }
        str = M2;
        a(sb, str);
        this.H.f = str;
    }

    public final void a(StringBuilder sb, CharSequence charSequence) {
        CharSequence a2 = dcy.a(charSequence);
        if (!TextUtils.isEmpty(a2)) {
            if (sb.length() > 0) {
                sb.append(this.O);
            } else {
                sb.append(this.P);
            }
            sb.append(a2);
        }
    }

    public final void a() {
        this.b.setText((CharSequence) null);
        this.c.setText((CharSequence) null);
        this.f.setText((CharSequence) null);
        this.g.setText((CharSequence) null);
        this.h.setText((CharSequence) null);
        this.j = false;
        this.d.setText((CharSequence) null);
        this.n.setText((CharSequence) null);
        this.m.setText((CharSequence) null);
        this.o.setText((CharSequence) null);
        this.G = null;
        this.H = null;
        b();
    }

    public final CharSequence a(long j2) {
        long j3 = j2 / 60000;
        if (j3 >= 60) {
            long j4 = j3 / 60;
            if (j4 > 23) {
                return null;
            }
            long j5 = j3 - (60 * j4);
            if (j5 <= 0) {
                return this.q.format(new Measure(Long.valueOf(j4), MeasureUnit.HOUR));
            }
            return this.q.formatMeasures(new Measure(Long.valueOf(j4), MeasureUnit.HOUR), new Measure(Long.valueOf(j5), MeasureUnit.MINUTE));
        } else if (j3 > 0) {
            return this.q.format(new Measure(Long.valueOf(j3), MeasureUnit.MINUTE));
        } else {
            if (j2 > 0) {
                return this.q.format(new Measure(1, MeasureUnit.MINUTE));
            }
            return null;
        }
    }

    public final CharSequence a(int i2, long j2) {
        int i3;
        if (j2 != 0) {
            switch (i2) {
                case 0:
                    i3 = R.plurals.program_interactions_views;
                    break;
                case 1:
                    i3 = R.plurals.program_interactions_listens;
                    break;
                case 2:
                    i3 = R.plurals.program_interactions_followers;
                    break;
                case 3:
                    i3 = R.plurals.program_interactions_fans;
                    break;
                case 4:
                    i3 = R.plurals.program_interactions_likes;
                    break;
                case 5:
                    i3 = R.plurals.program_interactions_thumbs;
                    break;
                case 6:
                    i3 = R.plurals.program_interactions_viewers;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            if (i3 != 0) {
                return this.a.getResources().getQuantityString(i3, (int) j2, Long.valueOf(j2));
            }
        }
        return null;
    }

    public final CharSequence a(int i2, int i3) {
        return this.a.getResources().getQuantityString(i2, i3, Integer.valueOf(i3));
    }

    public final CharSequence a(String str) {
        if (str != null) {
            try {
                if (str.length() == 4) {
                    int parseInt = Integer.parseInt(str);
                    return String.format(Locale.getDefault(), "%d", Integer.valueOf(parseInt));
                } else if (str.length() == 10) {
                    return this.M.format(I.parse(str));
                } else if (str.length() == 20) {
                    return DateUtils.getRelativeTimeSpanString(J.parse(str).getTime(), System.currentTimeMillis(), 0, 0);
                }
            } catch (NumberFormatException | ParseException e2) {
            }
        }
        return null;
    }

    private static final void a(View view, boolean z2) {
        boolean z3;
        int i2 = 0;
        if (view.getVisibility() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 != z2) {
            if (!z2) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public final void b() {
        TextView textView = this.b;
        boolean z2 = true;
        a(textView, textView.length() != 0);
        TextView textView2 = this.c;
        a(textView2, textView2.length() != 0);
        TextView textView3 = this.d;
        a(textView3, textView3.length() != 0);
        a(this.i, this.j);
        TextView textView4 = this.f;
        a(textView4, textView4.length() != 0);
        TextView textView5 = this.g;
        a(textView5, textView5.length() != 0);
        a(this.K, this.f.length() != 0);
        a(this.L, this.g.length() != 0);
        TextView textView6 = this.h;
        a(textView6, textView6.length() != 0);
        TextView textView7 = this.n;
        a(textView7, textView7.length() != 0);
        TextView textView8 = this.m;
        a(textView8, textView8.length() != 0);
        TextView textView9 = this.o;
        a(textView9, textView9.length() != 0);
        ImageView imageView = this.p;
        if (this.G == null) {
            z2 = false;
        }
        a(imageView, z2);
    }
}
