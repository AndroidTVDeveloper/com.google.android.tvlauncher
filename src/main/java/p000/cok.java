package p000;

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

/* renamed from: cok */
/* compiled from: PG */
final class cok {

    /* renamed from: I */
    private static final SimpleDateFormat f6175I = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: J */
    private static final SimpleDateFormat f6176J;

    /* renamed from: A */
    public final String f6177A;

    /* renamed from: B */
    public final String f6178B;

    /* renamed from: C */
    public final String f6179C;

    /* renamed from: D */
    public final String f6180D;

    /* renamed from: E */
    public final String f6181E;

    /* renamed from: F */
    public boolean f6182F = false;

    /* renamed from: G */
    public String f6183G;

    /* renamed from: H */
    public coj f6184H;

    /* renamed from: K */
    private final ImageView f6185K;

    /* renamed from: L */
    private final ImageView f6186L;

    /* renamed from: M */
    private final DateFormat f6187M;

    /* renamed from: N */
    private final cjq f6188N;

    /* renamed from: O */
    private final String f6189O;

    /* renamed from: P */
    private final String f6190P;

    /* renamed from: a */
    public final Context f6191a;

    /* renamed from: b */
    public final TextView f6192b;

    /* renamed from: c */
    public final TextView f6193c;

    /* renamed from: d */
    public final TextView f6194d;

    /* renamed from: e */
    public final int f6195e;

    /* renamed from: f */
    public final TextView f6196f;

    /* renamed from: g */
    public final TextView f6197g;

    /* renamed from: h */
    public final TextView f6198h;

    /* renamed from: i */
    public final BarRatingView f6199i;

    /* renamed from: j */
    public boolean f6200j;

    /* renamed from: k */
    public final Pattern f6201k;

    /* renamed from: l */
    public final View f6202l;

    /* renamed from: m */
    public final TextView f6203m;

    /* renamed from: n */
    public final TextView f6204n;

    /* renamed from: o */
    public final TextView f6205o;

    /* renamed from: p */
    public final ImageView f6206p;

    /* renamed from: q */
    public final MeasureFormat f6207q;

    /* renamed from: r */
    public final String f6208r;

    /* renamed from: s */
    public final String f6209s;

    /* renamed from: t */
    public final String f6210t;

    /* renamed from: u */
    public final String f6211u;

    /* renamed from: v */
    public final Drawable f6212v;

    /* renamed from: w */
    public final int f6213w;

    /* renamed from: x */
    public final int f6214x;

    /* renamed from: y */
    public final int f6215y;

    /* renamed from: z */
    public final String f6216z;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        f6176J = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public cok(View view) {
        this.f6191a = view.getContext();
        this.f6192b = (TextView) view.findViewById(R.id.first);
        this.f6193c = (TextView) view.findViewById(R.id.second);
        TextView textView = (TextView) view.findViewById(R.id.third);
        this.f6194d = textView;
        this.f6195e = textView.getMaxLines();
        this.f6196f = (TextView) view.findViewById(R.id.thumbCountUp);
        this.f6197g = (TextView) view.findViewById(R.id.thumbCountDown);
        this.f6185K = (ImageView) view.findViewById(R.id.thumbUp);
        this.f6186L = (ImageView) view.findViewById(R.id.thumbDown);
        this.f6198h = (TextView) view.findViewById(R.id.rating_percentage);
        this.f6199i = (BarRatingView) view.findViewById(R.id.star_rating);
        this.f6202l = view.findViewById(R.id.price_container);
        this.f6203m = (TextView) view.findViewById(R.id.old_price);
        this.f6204n = (TextView) view.findViewById(R.id.price);
        this.f6205o = (TextView) view.findViewById(R.id.content_rating);
        this.f6206p = (ImageView) view.findViewById(R.id.program_logo);
        TextView textView2 = this.f6203m;
        textView2.setPaintFlags(textView2.getPaintFlags() | 16);
        this.f6189O = this.f6191a.getString(R.string.program_metadata_item_separator);
        this.f6190P = this.f6191a.getString(R.string.program_metadata_prefix);
        this.f6208r = this.f6191a.getString(R.string.program_metadata_suffix);
        this.f6209s = this.f6191a.getString(R.string.program_availability_free_with_subscription);
        this.f6210t = this.f6191a.getString(R.string.program_availability_purchased);
        this.f6212v = view.getContext().getDrawable(R.drawable.ic_program_meta_purchased_black);
        this.f6211u = this.f6191a.getString(R.string.program_availability_free);
        this.f6213w = this.f6191a.getColor(R.color.program_meta_availability_default_color);
        this.f6214x = this.f6191a.getColor(R.color.program_meta_availability_purchased_color);
        this.f6215y = this.f6191a.getColor(R.color.program_meta_availability_free_color);
        this.f6216z = this.f6191a.getString(R.string.program_season_display_number);
        this.f6177A = this.f6191a.getString(R.string.program_episode_display_number);
        this.f6178B = this.f6191a.getString(R.string.program_chapter_display_number);
        this.f6179C = this.f6191a.getString(R.string.program_episode_title);
        this.f6180D = this.f6191a.getString(R.string.program_episode_title_and_short_description);
        this.f6181E = this.f6191a.getString(R.string.program_interaction_release_date_and_short_description);
        this.f6187M = android.text.format.DateFormat.getLongDateFormat(this.f6191a);
        this.f6207q = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.NARROW);
        this.f6188N = new cjq(this.f6191a);
        this.f6201k = Pattern.compile("^(\\d+),(\\d+)$");
    }

    /* renamed from: a */
    public final void mo3168a(StringBuilder sb, cxu cxu) {
        String[] decode;
        int length;
        String M = cxu.mo2996M();
        String str = null;
        if (TextUtils.isEmpty(M)) {
            cjq cjq = this.f6188N;
            String w = cxu.mo3024w();
            if (!TextUtils.isEmpty(w) && (length = (decode = TvContract.Programs.Genres.decode(w)).length) != 0) {
                List arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    int indexOf = cjq.f5731a.indexOf(decode[i]);
                    if (indexOf != -1) {
                        arrayList.add(cjq.f5732b[indexOf]);
                    }
                }
                if (arrayList.size() != 0) {
                    int size = arrayList.size();
                    int length2 = cjq.f5733c.length;
                    if (size > length2) {
                        arrayList = arrayList.subList(0, length2);
                    }
                    M = String.format(cjq.f5733c[arrayList.size() - 1], arrayList.toArray());
                }
            }
            mo3169a(sb, str);
            this.f6184H.f6168f = str;
        }
        str = M;
        mo3169a(sb, str);
        this.f6184H.f6168f = str;
    }

    /* renamed from: a */
    public final void mo3169a(StringBuilder sb, CharSequence charSequence) {
        CharSequence a = dcy.m6186a(charSequence);
        if (!TextUtils.isEmpty(a)) {
            if (sb.length() > 0) {
                sb.append(this.f6189O);
            } else {
                sb.append(this.f6190P);
            }
            sb.append(a);
        }
    }

    /* renamed from: a */
    public final void mo3167a() {
        this.f6192b.setText((CharSequence) null);
        this.f6193c.setText((CharSequence) null);
        this.f6196f.setText((CharSequence) null);
        this.f6197g.setText((CharSequence) null);
        this.f6198h.setText((CharSequence) null);
        this.f6200j = false;
        this.f6194d.setText((CharSequence) null);
        this.f6204n.setText((CharSequence) null);
        this.f6203m.setText((CharSequence) null);
        this.f6205o.setText((CharSequence) null);
        this.f6183G = null;
        this.f6184H = null;
        mo3170b();
    }

    /* renamed from: a */
    public final CharSequence mo3165a(long j) {
        long j2 = j / 60000;
        if (j2 >= 60) {
            long j3 = j2 / 60;
            if (j3 > 23) {
                return null;
            }
            long j4 = j2 - (60 * j3);
            if (j4 <= 0) {
                return this.f6207q.format(new Measure(Long.valueOf(j3), MeasureUnit.HOUR));
            }
            return this.f6207q.formatMeasures(new Measure(Long.valueOf(j3), MeasureUnit.HOUR), new Measure(Long.valueOf(j4), MeasureUnit.MINUTE));
        } else if (j2 > 0) {
            return this.f6207q.format(new Measure(Long.valueOf(j2), MeasureUnit.MINUTE));
        } else {
            if (j > 0) {
                return this.f6207q.format(new Measure(1, MeasureUnit.MINUTE));
            }
            return null;
        }
    }

    /* renamed from: a */
    public final CharSequence mo3164a(int i, long j) {
        int i2;
        if (j != 0) {
            switch (i) {
                case 0:
                    i2 = R.plurals.program_interactions_views;
                    break;
                case 1:
                    i2 = R.plurals.program_interactions_listens;
                    break;
                case 2:
                    i2 = R.plurals.program_interactions_followers;
                    break;
                case 3:
                    i2 = R.plurals.program_interactions_fans;
                    break;
                case 4:
                    i2 = R.plurals.program_interactions_likes;
                    break;
                case 5:
                    i2 = R.plurals.program_interactions_thumbs;
                    break;
                case 6:
                    i2 = R.plurals.program_interactions_viewers;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                return this.f6191a.getResources().getQuantityString(i2, (int) j, Long.valueOf(j));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final CharSequence mo3163a(int i, int i2) {
        return this.f6191a.getResources().getQuantityString(i, i2, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final CharSequence mo3166a(String str) {
        if (str != null) {
            try {
                if (str.length() == 4) {
                    int parseInt = Integer.parseInt(str);
                    return String.format(Locale.getDefault(), "%d", Integer.valueOf(parseInt));
                } else if (str.length() == 10) {
                    return this.f6187M.format(f6175I.parse(str));
                } else if (str.length() == 20) {
                    return DateUtils.getRelativeTimeSpanString(f6176J.parse(str).getTime(), System.currentTimeMillis(), 0, 0);
                }
            } catch (NumberFormatException | ParseException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    private static final void m5208a(View view, boolean z) {
        boolean z2;
        int i = 0;
        if (view.getVisibility() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public final void mo3170b() {
        TextView textView = this.f6192b;
        boolean z = true;
        m5208a(textView, textView.length() != 0);
        TextView textView2 = this.f6193c;
        m5208a(textView2, textView2.length() != 0);
        TextView textView3 = this.f6194d;
        m5208a(textView3, textView3.length() != 0);
        m5208a(this.f6199i, this.f6200j);
        TextView textView4 = this.f6196f;
        m5208a(textView4, textView4.length() != 0);
        TextView textView5 = this.f6197g;
        m5208a(textView5, textView5.length() != 0);
        m5208a(this.f6185K, this.f6196f.length() != 0);
        m5208a(this.f6186L, this.f6197g.length() != 0);
        TextView textView6 = this.f6198h;
        m5208a(textView6, textView6.length() != 0);
        TextView textView7 = this.f6204n;
        m5208a(textView7, textView7.length() != 0);
        TextView textView8 = this.f6203m;
        m5208a(textView8, textView8.length() != 0);
        TextView textView9 = this.f6205o;
        m5208a(textView9, textView9.length() != 0);
        ImageView imageView = this.f6206p;
        if (this.f6183G == null) {
            z = false;
        }
        m5208a(imageView, z);
    }
}
