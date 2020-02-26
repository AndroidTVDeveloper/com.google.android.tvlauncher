package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.tvlauncher.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: cjq */
/* compiled from: PG */
public final class cjq {

    /* renamed from: a */
    public static final List f5731a = Arrays.asList("FAMILY_KIDS", "SPORTS", "SHOPPING", "MOVIES", "COMEDY", "TRAVEL", "DRAMA", "EDUCATION", "ANIMAL_WILDLIFE", "NEWS", "GAMING", "ARTS", "ENTERTAINMENT", "LIFE_STYLE", "MUSIC", "PREMIER", "TECH_SCIENCE");

    /* renamed from: b */
    public final String[] f5732b;

    /* renamed from: c */
    public final String[] f5733c;

    public cjq(Context context) {
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(R.array.genre_labels);
        this.f5732b = stringArray;
        if (stringArray.length == f5731a.size()) {
            this.f5733c = resources.getStringArray(R.array.program_canonical_genre_labels_formats);
            return;
        }
        throw new IllegalArgumentException("Canonical genre data mismatch");
    }
}
