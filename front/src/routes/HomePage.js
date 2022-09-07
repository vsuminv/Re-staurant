import React from 'react';
import Layout from '../component/Layout/Layout';
import Header from '../component/Layout/Header';
import Tag from '../component/UI/Tag';
import PhotoCard from '../component/UI/PhotoCard';
import styles from './HomePage.module.css';

const TAG = ['삼겹살', '우동', '카레', '까눌레', '중식'];

const HomePage = () => {
  return (
    <Layout>
      <Header />
      <div className={styles.tags}>
        {TAG.map((item, i) => {
          return <Tag key={i} name={item} />;
        })}
      </div>
      <h3>맛 보장! 재방문 많은 맛집</h3>
      <div className={styles.section}>
        <PhotoCard />
        <PhotoCard />
        <PhotoCard />
        <PhotoCard />
      </div>
      <h3>친구가 다녀 온 그 곳!</h3>
      <div className={styles.section}>
        <PhotoCard />
        <PhotoCard />
        <PhotoCard />
        <PhotoCard />
      </div>
    </Layout>
  );
};

export default HomePage;
