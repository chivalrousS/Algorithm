// LCS.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include <string>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int LCS(string s1,string s2)
{
	if(s1 == "" || s2 == "")
		return 0;
	int m = s1.size() + 1;
	int n = s2.size() + 1;
	vector<vector<int>> lcs(m,vector<int>(n));
	for(int i = 0;i<m;++i )
	{
		for(int j = 0;j<n;++j)
		{
			if(i == 0)
				lcs[i][j] = 0;
			else if( j == 0)
				lcs[i][j] = 0;
			else
			{
			    if(s1[i-1] == s2[j-1])
				    lcs[i][j] = lcs[i-1][j-1] + 1;
			    else
				    lcs[i][j] = (lcs[i-1][j] >= lcs[i][j-1])?lcs[i-1][j]:lcs[i][j-1];
			}
		}
	}
	return lcs[m-1][n-1];
}

int _tmain(int argc, _TCHAR* argv[])
{
	string s1 = "BDCABA";
	string s2 = "ABCBDAB";
	int test = LCS(s1,s2);
	cout<<test<<endl;
	return 0;
}

