import './App.css';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './components/Header/Header';
import ListEmployee from './components/ListEmployee';
import CreateEmployee from './components/CreateEmployee';
import ViewEmployee from './components/ViewEmployee';
import Footer from './components/Footer/Footer';

function App() {
  return (
    <div>
      <Router>
        <Header />.
        <div class="container">
          <Routes>
            <Route path="/" exact component={ListEmployee}></Route>
            <Route path="/employees" component={ListEmployee}></Route>
            <Route path="/add-employee/:id" component={CreateEmployee}></Route>
            <Route path="/view-employee/:id" component={ViewEmployee}></Route>
            {/* <Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route> */}
          </Routes>
        </div>
        <Footer/>
      </Router>
    </div>
  );
}

export default App;
